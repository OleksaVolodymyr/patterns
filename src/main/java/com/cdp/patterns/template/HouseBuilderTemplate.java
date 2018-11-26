package com.cdp.patterns.template;

public abstract class HouseBuilderTemplate {

    public abstract void buildWall();

    public abstract void buildRoof();


    private void buildFoundation() {
        System.out.println("Use cement, sand  and rocks for foundation");
    }

    public final void buildHouse() {
        buildFoundation();
        buildWall();
        buildRoof();
        System.out.println("House is build");
    }

}
