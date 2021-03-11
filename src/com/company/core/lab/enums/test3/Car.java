package com.company.core.lab.enums.test3;

public class Car {

    public void drive(TrafficSignals signal) {

        if (signal.equals(TrafficSignals.RED)) {
            System.out.println("Stop!");
        } else if (signal.equals(TrafficSignals.GREEN)) {
            System.out.println("Go!");
        } else if (signal.equals(TrafficSignals.YELLOW)) {
            System.out.println("Wait!");
        }
    }
}
