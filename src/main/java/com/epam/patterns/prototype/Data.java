package com.epam.patterns.prototype;

public class Data implements Cloneable {
    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    protected Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }
}
