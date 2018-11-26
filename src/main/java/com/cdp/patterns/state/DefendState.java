package com.cdp.patterns.state;

public class DefendState implements State {
    @Override
    public void doAction(Droid droid) {
        System.out.println("Droid defend");
        droid.setState(this);
    }

    @Override
    public String toString() {
        return "DefendState";
    }
}
