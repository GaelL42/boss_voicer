package com.solvoicer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(SolVoicerConfig.GROUP)
public interface SolVoicerConfig extends Config
{
	String GROUP = "solVoicer";

	@ConfigItem(
			keyName = "volumeGain",
			name = "Volume Gain",
			description = "The volume gain used for the voice over audios."
	)
	@Range(min = -25, max = 6)
	default int volumeGain() {
		return 0;
	}

	@ConfigItem(
			keyName = "includeMinimus",
			name = "Include Minimus",
			description = "Whether or not Minimus's text should also be voiced."
			//position = 1
	)
	default boolean includeMinimus() { return false; }
}