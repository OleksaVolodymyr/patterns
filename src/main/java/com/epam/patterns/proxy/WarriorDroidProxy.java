package com.epam.patterns.proxy;

public class WarriorDroidProxy implements Droid {
    public boolean exist = false;
    public WarriorDroid droid;
    @Override
    public void dance() {
        // some logic
        if(!exist){
            droid=new WarriorDroid();
        }
        droid.dance();
    }
}
