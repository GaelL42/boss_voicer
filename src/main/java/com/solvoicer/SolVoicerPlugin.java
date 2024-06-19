package com.solvoicer;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.util.Text;
import javax.inject.Inject;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.FloatControl.Type;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.InterfaceID;
import net.runelite.api.widgets.Widget;
import net.runelite.client.callback.ClientThread;

@Slf4j
@PluginDescriptor(
	name = "Sol Voicer"
)
public class SolVoicerPlugin extends Plugin
{
	private final Map<VoiceActing, Clip> voiceActingClips = new HashMap<>();

	@Inject
	private SolVoicerConfig config;

	@Inject
	private Client client;

	@Inject
	private ClientThread clientThread;

	@Override
	protected void startUp() throws Exception
	{
		log.info("SolVoicer started!");
		loadVoiceActs();
		log.debug("Loaded {} voice over sounds", voiceActingClips.size());
		updateVolumeGain(config.volumeGain());
	}

	@Override
	protected void shutDown() throws Exception
	{
		unloadVoiceActs();
		log.info("SolVoicer stopped!");
	}

	@Provides
	SolVoicerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SolVoicerConfig.class);
	}

	@Subscribe
	public void onChatMessage(ChatMessage event) {
		if (event.getType() != ChatMessageType.GAMEMESSAGE) {
			return;
		}
		String text = Text.removeTags(event.getMessage());
		int speakerLength;
		if (text.startsWith("Sol Heredit: ")) {
			speakerLength = 13;
		} else if (text.startsWith("Minimus: ") && config.includeMinimus()) {
			speakerLength = 9;
		} else {
			return;
		}
		log.debug("About to try to play a sound from an overhead : " + text);
		VoiceActing voiceAct = VoiceActing.forTriggerLine(text.substring(speakerLength));
		if (voiceAct != null) {
			playVoiceAct(voiceAct);
		}
	}

	@Subscribe(priority=-100)
	private void onWidgetLoaded(WidgetLoaded event) {
		if (event.getGroupId() == InterfaceID.DIALOG_NPC) {
			// InvokeAtTickEnd to wait until the text has loaded in
			clientThread.invokeAtTickEnd(() -> {
				Widget npcNameWidget = client.getWidget(ComponentID.DIALOG_NPC_NAME);
				if (npcNameWidget == null) {
					log.error("NPC name textWidget is null");
					return;
				}
				String npcName = npcNameWidget.getText();
				if (npcName.equals("Sol Heredit") ||
						(npcName.equals("Minimus") && config.includeMinimus())) {
					Widget textWidget = client.getWidget(ComponentID.DIALOG_NPC_TEXT);
					if (textWidget == null || textWidget.getText() == null) {
						log.error("NPC dialog textWidget or textWidget.getText() is null");
						return;
					}
					String text = Text.sanitizeMultilineText(textWidget.getText());
					log.debug("About to try to play a sound from the chatbox : " + text);
					VoiceActing voiceAct = VoiceActing.forTriggerLine(text);
					if (voiceAct != null) {
						playVoiceAct(voiceAct);
					}
				}
			});
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged event) {
		if (event.getGroup().equals(SolVoicerConfig.GROUP)) {
			log.debug("Updating volume gain to {} Db", config.volumeGain());
			updateVolumeGain(config.volumeGain());
		}
	}

	private void loadVoiceActs() {
		for (VoiceActing voiceAct : VoiceActing.values()) {
			try {
				Clip audioClip = AudioSystem.getClip();
				loadSound(audioClip, voiceAct.file());
				voiceActingClips.put(voiceAct, audioClip);
			} catch (LineUnavailableException e) {
				log.warn("Failed to play audio clip", e);
			}
		}
	}

	private void unloadVoiceActs() {
		for (Clip audioClip : voiceActingClips.values()) {
			audioClip.stop();
			audioClip.close();
		}
	}

	private void updateVolumeGain(float decibels) {
		for (Clip clip : voiceActingClips.values()) {
			FloatControl control = (FloatControl) clip.getControl(Type.MASTER_GAIN);
			control.setValue(decibels);
		}
	}

	private void playVoiceAct(VoiceActing voiceAct) {
		Clip clip = voiceActingClips.get(voiceAct);
		if (clip == null) {
			log.warn("Voice clip '{}' is not loaded.", voiceAct);
		} else {
			playSound(clip);
		}
	}

	private void playSound(Clip audioClip) {
		audioClip.setFramePosition(0);
		audioClip.loop(0);
	}

	private void loadSound(Clip audioClip, String name) {
		InputStream in = getClass().getResourceAsStream("/sounds/" + name);
		if (in == null) {
			log.warn("Missing audio file {}", name);
			return;
		}
		try (InputStream fileStream = new BufferedInputStream(in);
			 AudioInputStream audioStream = AudioSystem.getAudioInputStream(fileStream)) {
			audioClip.open(audioStream);
		} catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
			log.warn("Failed to load audio file", e);
		}
	}
}
