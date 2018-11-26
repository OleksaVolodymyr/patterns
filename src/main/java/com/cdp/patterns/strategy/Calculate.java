package com.cdp.patterns.strategy;

public class Calculate {

    private Strategy strategy;

    public Calculate(Strategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
