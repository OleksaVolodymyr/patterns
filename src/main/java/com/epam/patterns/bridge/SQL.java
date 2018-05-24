package com.epam.patterns.bridge;

public interface SQL {
    void insert(String query);

    boolean update(String query);

    String select(String query);

    boolean delete(String query);

}
