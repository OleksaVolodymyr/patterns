package com.cdp.patterns.abstractfactory.selector;

import com.cdp.patterns.abstractfactory.enums.MageDroidType;
import com.cdp.patterns.abstractfactory.model.MageDroid;
import com.cdp.patterns.abstractfactory.model.MagicDroid;
import com.cdp.patterns.abstractfactory.model.PriestDroid;

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
