package com.epam.patterns.visitor;

public interface Droid {
	 void attack();

	 void defence();

	 void move();

	 String accept(Visitor visitor);

}
