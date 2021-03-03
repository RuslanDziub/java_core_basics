package com.company.core.homework6;

public class Rectangle {
    private double length;
    private double width;

    Rectangle () {
        this.length = 2;
        this.width = 3;
    }

    Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double S () {
        return this.length * this.width;
    }

    public double P () {
        return 2 * (this.length + this.width);
    }
}
