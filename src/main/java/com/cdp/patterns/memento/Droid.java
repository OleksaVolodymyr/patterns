package com.cdp.patterns.memento;

import java.util.Objects;

public class Droid {
    private String liveTime;

    public void setLiveTime(String liveTime) {
        this.liveTime = liveTime;
    }

    public Memento saveToMemento() {
        return new Memento(liveTime);
    }

    public void restore(Memento memento) {
        liveTime = memento.getLifeTime();
    }

    public String getLiveTime() {
        return liveTime;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "liveTime='" + liveTime + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Droid droid = (Droid) o;
        return Objects.equals(liveTime, droid.liveTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveTime);
    }
}
