package com.company.core.flower.flowers;

public class Orchid extends Flower {
    public Orchid (String color, double price) {
        this.color = color;
        this.price = price;
    }
    public void smell() {
        System.out.println("I smell like a orchid");
    }
}
