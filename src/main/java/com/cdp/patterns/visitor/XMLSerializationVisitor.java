package com.cdp.patterns.visitor;

public class XMLSerializationVisitor implements Visitor {


    public String export(Droid... droids) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Droid droid : droids) {
            sb.append(droid.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visit(ArcherDroid droid) {
        return "<archerDroid>" + "\n" +
                "    <name>" + droid.getName() + "</name>" + "\n" +
                "    <damage>" + droid.getDamage() + "</damage>" + "\n" +
                "    <health>" + droid.getHealth() + "</health>" + "\n" +
                "</archerDroid>";
    }

    @Override
    public String visit(WarriorDroid droid) {
        return "<warriorDroid>" + "\n" +
                "    <name>" + droid.getName() + "</name>" + "\n" +
                "    <damage>" + droid.getDamage() + "</damage>" + "\n" +
                "    <health>" + droid.getHealth() + "</health>" + "\n" +
                "</warriorDroid>";
    }
}
