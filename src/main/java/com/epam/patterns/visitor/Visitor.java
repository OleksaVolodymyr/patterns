package com.epam.patterns.visitor;

public interface Visitor {

    String visitArcherDroid(ArcherDroid droid);

    String visitWarriorDroid(WarriorDroid droid);


}
