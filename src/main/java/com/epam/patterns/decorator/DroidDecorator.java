package com.epam.patterns.decorator;

public  class DroidDecorator implements Droid {
    protected Droid droid;

    public DroidDecorator(Droid droid) {
        this.droid = droid;
    }

    @Override
    public void dance() {
        this.droid.dance();
    }
}
