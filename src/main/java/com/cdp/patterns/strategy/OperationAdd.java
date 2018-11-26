package com.cdp.patterns.strategy;

public class OperationAdd implements Strategy {
    @Override
    public double doOperation(int a, int b) {
        return a+b;
    }
}
