package com.epam.patterns.memento;

import java.util.Objects;

public class Memento {

    private String lifeTime;

    public  Memento(String state) {
        this.lifeTime = state;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memento memento = (Memento) o;
        return Objects.equals(lifeTime, memento.lifeTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(lifeTime);
    }
}
