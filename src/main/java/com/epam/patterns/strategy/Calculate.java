package com.epam.patterns.strategy;

public class Calculate {

    private Strategy strategy;

    public Calculate(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculate(int a, int b) {
        System.out.println(strategy.doOperation(a, b));
    }
}
