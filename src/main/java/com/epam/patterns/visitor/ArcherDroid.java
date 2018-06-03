package com.epam.patterns.visitor;

public class ArcherDroid implements Droid {

    private String name;

    private int damage;

    private int health;

    public ArcherDroid(String name, int damage, int health) {
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
        System.out.println("Archer Droid attack");
    }

    @Override
    public void defence() {
        System.out.println("Archer Droid defence");
    }

    @Override
    public void move() {
        System.out.println("Archer Droid move");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitArcherDroid(this);
    }
}
