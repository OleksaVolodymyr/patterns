package com.epam.patterns.adapter;

public class OldAPIImpl implements OldAPI {
    @Override
    public void oldGet() {
        System.out.println("This is old get method");
    }

    @Override
    public void oldPost() {
        System.out.println("This is old post method");
    }

    @Override
    public void oldDelete() {
        System.out.println("This is old delete method");
    }
}
