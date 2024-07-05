package com.bossvoicer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup(BossVoicerConfig.GROUP)
public interface BossVoicerConfig extends Config
{
	String GROUP = "bossVoicer";

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
			keyName = "includeGraardor",
			name = "General Graardor",
			description = "Whether or not General Graardor should be voiced."
	)
	default boolean includeGraardor() { return true; }

	@ConfigItem(
			keyName = "includeKril",
			name = "K'ril Tsutsaroth",
			description = "Whether or not K'ril Tsutsaroth should be voiced."
	)
	default boolean includeKril() { return true; }

	@ConfigItem(
			keyName = "includeVetion",
			name = "Vet'ion & Calvar'ion",
			description = "Whether or not Vet'ion & Calvar'ion should be voiced."
	)
	default boolean includeVetion() { return true; }

	@ConfigItem(
			keyName = "includeSol",
			name = "Sol Heredit",
			description = "Whether or not Sol Heredit should be voiced."
	)
	default boolean includeSol() { return true; }

	@ConfigItem(
			keyName = "includeMinimus",
			name = "Minimus",
			description = "Whether or not some of Minimus's lines should be voiced (mostly for debugging purposes)."
	)
	default boolean includeMinimus() { return false; }

	@ConfigItem(
			keyName = "includeBarrows",
			name = "Barrows Brothers",
			description = "Whether or not the Barrows Brothers should be voiced (only 2 lines)."
	)
	default boolean includeBarrows() { return true; }

	@ConfigItem(
			keyName = "includeOrators",
			name = "Vyre Orators",
			description = "Whether or not the Vyre Orators should be voiced."
	)
	default boolean includeOrators() { return false; }

	@ConfigItem(
			keyName = "includeVerzik",
			name = "Verzik Vitur",
			description = "Whether or not Lazy Verzik Vitur should be voiced."
	)
	default boolean includeVerzik() { return true; }
}