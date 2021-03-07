package com.company.core.flower.flowers;

public abstract class Flower {
    protected String color;
    protected double price;
    public double getPrice() { return this.price; }
    abstract void smell();
}
