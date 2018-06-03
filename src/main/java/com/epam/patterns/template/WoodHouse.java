package com.epam.patterns.template;

public class WoodHouse extends HouseBuilderTemplate {
    @Override
    public void buildWall() {
        System.out.println("Build wooden walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build wooden roof");
    }
}
