package com.cdp.patterns.abstractfactory.model;

public class WariorDroid implements Droid {

	@Override
	public void attack() {
		System.out.println("Warior Droid attack");
	}

	@Override
	public void defence() {
		System.out.println("Warior Droid defence");
	}

	@Override
	public void move() {
		System.out.println("Warior Droid move");
	}

}
