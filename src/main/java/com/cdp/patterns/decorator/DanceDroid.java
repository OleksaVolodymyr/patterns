package com.cdp.patterns.decorator;

public class DanceDroid extends DroidDecorator {
    public DanceDroid(Droid droid) {
        super(droid);
    }

    @Override
    public void dance() {
        super.dance();
        System.out.println("Tango Dance");
    }


}
