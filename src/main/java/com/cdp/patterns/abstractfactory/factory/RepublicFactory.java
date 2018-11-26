package com.cdp.patterns.abstractfactory.factory;

import com.cdp.patterns.abstractfactory.enums.DroidType;
import com.cdp.patterns.abstractfactory.enums.MageDroidType;
import com.cdp.patterns.abstractfactory.model.Droid;
import com.cdp.patterns.abstractfactory.model.MagicDroid;
import com.cdp.patterns.abstractfactory.selector.DroidSelector;
import com.cdp.patterns.abstractfactory.selector.MageDroidSelector;

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
