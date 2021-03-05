package com.company.core.cars.varietiesOfCars;

public class Car {
    protected String mark;
    protected String model;
    protected String complectation;
    protected String color;
    protected double price;
    protected int maxSpeed = 458;
    protected int speed;

    Car () {}


    public void drive () {
        this.speed = 0;
        System.out.println("The car is standing, speed = " + this.speed + " km/h");
    }

    public void drive (int speed) {
        this.speed = speed;
        if (this.speed == 0) {
            System.out.println("The car is standing, speed = " + this.speed + " km/h");
        } else if (this.speed < 0) {
            System.out.println("Error! speed < 0!");
        } else if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
            System.out.println("The car is driving, speed max = " + this.speed + " km/h");
        } else {
            System.out.println("The car is driving, speed = " + this.speed + " km/h");
        }
    }

    public void showFuelConsumption (int speed) {
        this.speed = speed;
        double fuelConsumption = this.speed / 10;
        if (this.speed == 0) {
            System.out.println("The car is standing, fuel consumption = " + fuelConsumption + " l/100km");
        } else if (this.speed < 0) {
            System.out.println("Error! speed < 0!");
        } else if (this.speed > this.maxSpeed) {
            this.speed = this.maxSpeed;
            System.out.println("Fuel consumption = max = " + fuelConsumption + " l/100km");
        } else {
            System.out.println("Fuel consumption = " + fuelConsumption + " l/100km");
        }
    }
}
