package com.epam.patterns.abstractfactory.factory;

import com.epam.patterns.abstractfactory.enums.DroidType;
import com.epam.patterns.abstractfactory.enums.MageDroidType;
import com.epam.patterns.abstractfactory.model.Droid;
import com.epam.patterns.abstractfactory.model.MagicDroid;

public interface DroidFactory {
	 Droid getDroid(DroidType droidType);

	 MagicDroid getMagicDroid(MageDroidType droidType);
}
