package com.company.core.flower.flowers;

public abstract class Flower {
    protected String color;
    protected double price;

    public Flower (String color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() { return this.price; }
    abstract void smell();
}
