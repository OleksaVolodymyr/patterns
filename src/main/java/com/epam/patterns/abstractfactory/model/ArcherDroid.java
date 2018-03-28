package com.epam.patterns.abstractfactory.model;

public class ArcherDroid implements Droid {

	@Override
	public void attack() {
		System.out.println("Archer Droid attack");
	}

	@Override
	public void defence() {
		System.out.println("Archer Droid defence");
	}

	@Override
	public void move() {
		System.out.println("Archer Droid move");
	}
}
