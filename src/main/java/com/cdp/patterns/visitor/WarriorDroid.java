package com.cdp.patterns.visitor;

public class WarriorDroid implements Droid {

    private String name;

    private int damage;

    private int health;

    public WarriorDroid(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack() {
        System.out.println("Warior Droid attack");
    }

    @Override
    public void defence() {
        System.out.println("Warior Droid defence");
    }

    @Override
    public void move() {
        System.out.println("Warior Droid move");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitWarriorDroid(this);
    }

}
