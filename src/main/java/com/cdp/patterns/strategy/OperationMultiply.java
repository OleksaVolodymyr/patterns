package com.cdp.patterns.strategy;

public class OperationMultiply implements Strategy {
    @Override
    public double doOperation(int a, int b) {
        return a*b;
    }
}
