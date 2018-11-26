package com.cdp.patterns.facade;

public class Armor {

    private int value;


    public void setArmor(String type) {
        switch (type) {
            case "Male":
                value = 8;
                break;
            case "Plate":
                value = 10;
                break;
        }

    }
}
