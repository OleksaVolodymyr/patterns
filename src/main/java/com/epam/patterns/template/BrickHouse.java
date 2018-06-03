package com.epam.patterns.template;

public class BrickHouse extends HouseBuilderTemplate {
    @Override
    public void buildWall() {
        System.out.println("Build brick walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Build metal walls");
    }
}
