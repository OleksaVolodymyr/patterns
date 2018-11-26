package com.cdp.patterns.iterator;

public class OwnArrayList implements Iterator {
    private Object[] arr = {"1","2","3","4"};
    private int index = 0;

    @Override
    public boolean hasNext() {
        if (index < arr.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return arr[index++];
        }
        return null;
    }
    
}
