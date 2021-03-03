package com.company.core.homework6;

public class Circle {
    private double r;
    private double pi = 3.14;

    Circle (double r) {
        this.r = r;
    }

    Circle () {
        this.r = 1;
    }

    public double S () {
        return this.pi * Math.pow(this.r, 2);
    }

    public double l () {
        return 2 * this.pi * this.r;
    }
}
