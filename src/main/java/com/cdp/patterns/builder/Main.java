package com.cdp.patterns.builder;

public class Main {

	public static void main(String[] args) {

		Droid droid = new Droid.DroidBuilder().setAttack(1).setHealth(1).setName("1").build();
		System.out.println(droid);
	
		

	}

}
