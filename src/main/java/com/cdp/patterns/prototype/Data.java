package com.cdp.patterns.prototype;

import java.util.Objects;

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
    public Data clone() throws CloneNotSupportedException {
        return (Data) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return year == data.year &&
                Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, year);
    }
}
