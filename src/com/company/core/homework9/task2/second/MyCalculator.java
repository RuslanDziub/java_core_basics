package com.company.core.homework9.task2.second;

import com.company.core.homework9.task2.first.Numerable;

public class MyCalculator implements Numerable {

    @Override
    public double devide(double a, double b) {
        return a / b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double plus(double a, double b) {
        return a + b;
    }
}
