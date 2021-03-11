package com.company.core.lab.OOPflower.flowers;

public class Orchid extends Flower {
    public Orchid (String color, double price) {
        super(color, price);
    }
    public void smell() {
        System.out.println("I smell like a orchid");
    }
}
