package com.cdp.patterns.abstractfactory.model;

public class MageDroid implements MagicDroid {

	@Override
	public void cast() {
		System.out.println("Mage Droid cast spell");
	}

	@Override
	public void heal() {
		System.out.println("Mage Droid heal");
	}

	@Override
	public void move() {
		System.out.println("Mage Droid move");
	}

}
