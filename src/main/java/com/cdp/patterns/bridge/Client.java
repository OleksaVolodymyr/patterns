package com.cdp.patterns.bridge;

public abstract class Client {

    private SQL sql;

    public Client(SQL sql) {
        this.sql = sql;
    }

    public void create(String query) {
        sql.insert(query);
    }

    public String read(String query) {
        return sql.select(query);
    }

    public boolean update(String query) {
        return sql.update(query);
    }

    public boolean delete(String query) {
        return sql.delete(query);
    }


}
