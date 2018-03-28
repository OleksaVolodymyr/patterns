package com.epam.patterns.adapter;



public class App {
    public static void main(String[] args) {
        OldAPI api = new OldAPIImpl();
        API newAPI = new AdapterAPI(api);
        newAPI.get();
        newAPI.post();
        newAPI.delete();

    }
}
