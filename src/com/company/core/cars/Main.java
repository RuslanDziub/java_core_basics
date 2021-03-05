package com.company.core.cars;

import com.company.core.cars.varietiesOfCars.Sedan;

public class Main {
    public static void main(String[] args) {
        Sedan BMW5 = new Sedan("BMW", "m5", "premium", "black");
        Sedan BMW3 = new Sedan("BMW", "m3", "econom", "gray");
        BMW5.drive(60);
    }
}
