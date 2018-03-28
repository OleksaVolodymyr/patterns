package com.epam.patterns.abstractfactory.selector;

import com.epam.patterns.abstractfactory.enums.MageDroidType;
import com.epam.patterns.abstractfactory.model.MageDroid;
import com.epam.patterns.abstractfactory.model.MagicDroid;
import com.epam.patterns.abstractfactory.model.PriestDroid;

public class MageDroidSelector {
	private MagicDroid magicDroid = null;

	public MagicDroid getDroid(MageDroidType droidType) {
		switch (droidType) {
		case MAGE:
			magicDroid = new MageDroid();
			break;
		case PRIEST:
			magicDroid = new PriestDroid();
			break;
		}
		return magicDroid;
	}
}
