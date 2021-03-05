package com.company.core.homework7.task2;

import com.company.core.homework7.task2.car.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "m5", "premium");
        Car car2 = new Car("Mersedes", "e63", "luxiry");
        Car car3 = new Car("Audi", "RS6", "standart");

        car1.showCar();
        System.out.println("==========================================");
        car2.showCar();
        System.out.println("==========================================");
        car3.showCar();
    }
}
