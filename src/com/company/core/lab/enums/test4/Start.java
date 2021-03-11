package com.company.core.lab.enums.test4;

import com.company.core.lab.enums.test3.Car;
import com.company.core.lab.enums.test3.TrafficSignals;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Car car = new Car();
        car.drive(TrafficSignals.RED);
        car.drive(TrafficSignals.YELLOW);
        car.drive(TrafficSignals.GREEN);

        for (TrafficSignals signal : TrafficSignals.values()) {
            System.out.println(signal.ordinal() + " " + signal.name());
        }

        TrafficSignals signal = TrafficSignals.valueOf("green".toUpperCase());
        boolean isGreen = signal.equals(TrafficSignals.GREEN);

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        for(Country country : Country.values()) {
            if(country.getName().equalsIgnoreCase(text)) {
                System.out.println(country.getCapital().getName());
                if(country.getCapital().has1M()) {
                    System.out.println("Too much people there.");
                }
            }
        }
    }
}
