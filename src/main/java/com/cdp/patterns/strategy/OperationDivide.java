package com.cdp.patterns.strategy;

public class OperationDivide implements Strategy{
    @Override
    public double doOperation(int a, int b) {
        return a/b;
    }
}
