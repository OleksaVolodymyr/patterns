package com.cdp.patterns.facade;

public class Weapon {

    private int damage;

    public void setDamage(String type) {
        switch (type) {
            case "Sword":
                damage = 15;
                break;
            case "Axe":
                damage = 17;
                break;
        }

    }


}
