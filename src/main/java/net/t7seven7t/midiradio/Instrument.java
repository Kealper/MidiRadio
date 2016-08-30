/**
 * Copyright (C) 2012 t7seven7t
 */
package net.t7seven7t.midiradio;

import org.bukkit.Sound;

/**
 * @author t7seven7t
 */
public class Instrument {

	public static Sound getInstrument(int patch, int channel) {

		if (channel == 9) { // Drums - should actually be 10 but for some reason java makes it 9...
			return Sound.BLOCK_NOTE_BASEDRUM;
		}

		if (patch >= 8 && patch <= 15) { // Chromatic percussion
			return Sound.BLOCK_NOTE_PLING;
		}

		if (patch >= 24 && patch <= 39) { // Guitars & bass
			return Sound.BLOCK_NOTE_BASS;
		}

		if (patch >= 113 && patch <= 119) { // Percussive
			if (patch == 114) { // Steel drums should pling
				return Sound.BLOCK_NOTE_PLING;
			}
			return Sound.BLOCK_NOTE_BASEDRUM;
		}

		if (patch >= 120 && patch <= 127) { // Misc.
			return Sound.BLOCK_NOTE_SNARE;
		}

		return Sound.BLOCK_NOTE_HARP;

	}

}
