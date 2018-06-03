package com.epam.patterns.strategy;

public class App {

    public static void main(String[] args) {
       Calculate calculate = new Calculate(new OperationAdd());
       calculate.calculate(4,5);
       calculate = new Calculate(new OperationDivide());
       calculate.calculate(4,2);
       calculate = new Calculate(new OperationMultiply());
       calculate.calculate(10,10);
    }
}
