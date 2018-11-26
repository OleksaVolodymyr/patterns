package com.cdp.patterns.adapter;

public class AdapterAPI implements API {

    private OldAPI oldAPI;

    public AdapterAPI(OldAPI oldAPI) {
        this.oldAPI = oldAPI;
    }

    @Override
    public void get() {
        oldAPI.oldGet();
    }

    @Override
    public void post() {
        oldAPI.oldPost();
    }

    @Override
    public void delete() {
        oldAPI.oldDelete();
    }
}
