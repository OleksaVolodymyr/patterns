package com.epam.patterns.template;

public class App {

    public static void main(String[] args){
        HouseBuilderTemplate house = new WoodHouse();
        house.buildHouse();
        house = new BrickHouse();
        house.buildHouse();
    }
}
