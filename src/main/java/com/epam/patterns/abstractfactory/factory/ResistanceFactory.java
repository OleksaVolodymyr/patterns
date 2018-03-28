package com.epam.patterns.abstractfactory.factory;

import com.epam.patterns.abstractfactory.enums.DroidType;
import com.epam.patterns.abstractfactory.enums.MageDroidType;
import com.epam.patterns.abstractfactory.model.Droid;
import com.epam.patterns.abstractfactory.model.MageDroid;
import com.epam.patterns.abstractfactory.model.MagicDroid;
import com.epam.patterns.abstractfactory.model.WariorDroid;

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
