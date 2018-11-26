package com.cdp.patterns.abstractfactory.factory;

import com.cdp.patterns.abstractfactory.enums.DroidType;
import com.cdp.patterns.abstractfactory.enums.MageDroidType;
import com.cdp.patterns.abstractfactory.model.Droid;
import com.cdp.patterns.abstractfactory.model.MagicDroid;

public interface DroidFactory {
	 Droid getDroid(DroidType droidType);

	 MagicDroid getMagicDroid(MageDroidType droidType);
}
