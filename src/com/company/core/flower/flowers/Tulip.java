package com.company.core.flower.flowers;

public class Tulip extends Flower {
    public Tulip (String color, double price) {
        this.color = color;
        this.price = price;
    }
    public void smell() {
        System.out.println("I smell like a tulip");
    }
}
