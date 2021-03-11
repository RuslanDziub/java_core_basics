package com.company.core.lab.enums.test4;

public enum City {

    KYIV("Kyiv", 3456876, 345543),
    LVIV("Lviv", 4563432, 987634),
    PARIS("Paris", 7654376, 1876943);

    private String name;
    private double square;
    private long population;

    City(String name, double square, long population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public long getPopulation() {
        return population;
    }

    public boolean has1M() {
        return population >= 1000000;
    }
}
