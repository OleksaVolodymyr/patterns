package com.cdp.patterns.abstractfactory.selector;

import com.cdp.patterns.abstractfactory.enums.DroidType;
import com.cdp.patterns.abstractfactory.model.ArcherDroid;
import com.cdp.patterns.abstractfactory.model.Droid;
import com.cdp.patterns.abstractfactory.model.WariorDroid;

public class DroidSelector {
	private Droid droid = null;


	public Droid getDroid(DroidType droidType) {
		switch (droidType) {
		case ARCHER:
			droid = new ArcherDroid();
			break;
		case WARRIOR:
			droid = new WariorDroid();
			break;
		}
		return droid;
	}
}
