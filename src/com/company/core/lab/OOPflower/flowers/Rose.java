package com.company.core.lab.OOPflower.flowers;

public class Rose extends Flower {
    public Rose (String color, double price) {
        super(color, price);
    }
    public void smell() {
        System.out.println("I smell like a rose");
    }
}