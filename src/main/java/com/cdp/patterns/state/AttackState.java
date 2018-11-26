package com.cdp.patterns.state;

public class AttackState implements State {

    @Override
    public void doAction(Droid droid) {
        System.out.println("Droid attack");
        droid.setState(this);
    }

    @Override
    public String toString() {
        return "AttackState";
    }

}
