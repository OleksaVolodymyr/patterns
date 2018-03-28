package com.epam.patterns.abstractfactory.factory;

import com.epam.patterns.abstractfactory.enums.DroidType;
import com.epam.patterns.abstractfactory.enums.MageDroidType;
import com.epam.patterns.abstractfactory.model.Droid;
import com.epam.patterns.abstractfactory.model.MagicDroid;
import com.epam.patterns.abstractfactory.selector.DroidSelector;
import com.epam.patterns.abstractfactory.selector.MageDroidSelector;

public class RepublicFactory implements DroidFactory {

	@Override
	public Droid getDroid(DroidType droidType) {
		return new DroidSelector().getDroid(droidType);
	}

	@Override
	public MagicDroid getMagicDroid(MageDroidType droidType) {
		return new MageDroidSelector().getDroid(droidType);
	}

}
