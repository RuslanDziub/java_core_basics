package com.company.core.cars.varietiesOfCars;

public class Sedan extends Car {
    private int nom;

    public Sedan () {

    }

    public Sedan (String mark, String model, String complectation, String color) {
        this.mark = mark;
        this.model = model;
        this.complectation = complectation;
        this.color = color;
    }

//    public void drive (int speed) {
//        this.speed = speed;
//        System.out.println("Drive sedan " + this.speed);
//    }
}
