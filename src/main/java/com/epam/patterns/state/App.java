package com.epam.patterns.state;

public class App {

    public static void main(String[] args) {
        Droid droid = new Droid();

        State attack = new AttackState();
        attack.doAction(droid);
        System.out.println("Current state: " + droid.getState().toString());
        State defend = new DefendState();
        defend.doAction(droid);
        System.out.println("Current state: " + droid.getState().toString());
    }
}
