package com.cdp.patterns.bridge;

public class DBClient extends Client {
    public DBClient(SQL sql) {
        super(sql);
    }

    public void readAndDelete(String query) {
        read(query);
        delete(query);
    }
}
