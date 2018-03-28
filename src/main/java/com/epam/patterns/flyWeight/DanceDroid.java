package com.epam.patterns.flyWeight;

public class DanceDroid implements Droid {
    private String name;

    public DanceDroid(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("Dance");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DanceDroid that = (DanceDroid) o;

        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
