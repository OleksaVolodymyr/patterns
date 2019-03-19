package com.cdp.patterns.visitor;

public interface Visitor {

    String visit(ArcherDroid droid);

    String visit(WarriorDroid droid);


}
