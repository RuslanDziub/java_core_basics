package com.company.core.flower.flowers;

public class Lily extends Flower {
    public Lily(String color, double price) {
        super(color, price);
    }

    public void smell() {
        System.out.println("I smell like a lily");
    }
}
