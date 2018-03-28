package com.epam.patterns.facade;


public class Droid {
    private Weapon weapon;
    private Armor armor;
    private Ability ability;

    public Droid() {
        weapon = new Weapon();
        armor = new Armor();
        ability = new Ability();
    }

    public void creareDroid() {
        weapon.setDamage("Axe");
        armor.setArmor("Plate");
        ability.setAbilityType("Magic");
    }
}
