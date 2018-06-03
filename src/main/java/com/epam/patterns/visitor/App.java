package com.epam.patterns.visitor;

public class App {

    public static void main(String[] args) {
        Droid warrior = new WarriorDroid("Nick", 10, 250);
        Droid archer = new ArcherDroid("Bob", 15, 210);

        XMLSerializationVisitor xmlVisitor = new XMLSerializationVisitor();

        System.out.println(xmlVisitor.export(warrior, archer));
    }
}
