package com.cdp.patterns.abstractfactory.factory;

import com.cdp.patterns.abstractfactory.enums.DroidType;
import com.cdp.patterns.abstractfactory.enums.MageDroidType;
import com.cdp.patterns.abstractfactory.model.Droid;
import com.cdp.patterns.abstractfactory.model.MageDroid;
import com.cdp.patterns.abstractfactory.model.MagicDroid;
import com.cdp.patterns.abstractfactory.model.WariorDroid;

public class ResistanceFactory implements DroidFactory {

	@Override
	public Droid getDroid(DroidType droidType) {
		return new WariorDroid();
	}

	@Override
	public MagicDroid getMagicDroid(MageDroidType droidType) {
		return new MageDroid();
	}

}
