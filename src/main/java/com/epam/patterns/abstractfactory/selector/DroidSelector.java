package com.epam.patterns.abstractfactory.selector;

import com.epam.patterns.abstractfactory.enums.DroidType;
import com.epam.patterns.abstractfactory.model.ArcherDroid;
import com.epam.patterns.abstractfactory.model.Droid;
import com.epam.patterns.abstractfactory.model.WariorDroid;

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
