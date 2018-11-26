package com.cdp.patterns.bridge;

public class MySQL implements SQL {
    @Override
    public void insert(String query) {
    }

    @Override
    public boolean update(String query) {
        return false;
    }

    @Override
    public String select(String query) {
        return null;
    }

    @Override
    public boolean delete(String query) {
        return false;
    }
}
