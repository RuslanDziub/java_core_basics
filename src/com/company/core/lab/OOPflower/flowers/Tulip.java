package com.company.core.lab.OOPflower.flowers;

public class Tulip extends Flower {
    public Tulip (String color, double price) {
        super(color, price);
    }
    public void smell() {
        System.out.println("I smell like a tulip");
    }
}
