package com.epam.patterns.facade;

public class Ability {

    private String abilityType;

    public void  setAbilityType(String type){
        switch (type) {
            case "Physical":
                abilityType = "Shield Block";
                break;
            case "Magic":
                abilityType = "Fireball";
                break;
        }
    }
}
