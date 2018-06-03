package com.epam.patterns.state;

public class Droid {

    private State state;

    public Droid() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
