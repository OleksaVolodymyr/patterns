package com.cdp.patterns.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class DroidFactory {
    private final static Map<String, Droid> droids = new HashMap();

    public static Droid getDroid(String name) {
        DanceDroid droid = (DanceDroid) droids.get(name);

        if (droid == null) {
            droid = new DanceDroid(name);
            droids.put(name, droid);
        }
        return droid;
    }

}
