package com.cdp.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> list = new ArrayList<>();

    public void addMemento(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
