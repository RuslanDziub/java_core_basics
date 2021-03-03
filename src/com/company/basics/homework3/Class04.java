package com.company.basics.homework3;

import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        System.out.print("number1 = ");
        double number1 = scanner.nextDouble();
        System.out.print("number2 = ");
        double number2 = scanner.nextDouble();

        if (number1 == number2) {
            System.out.println("number1 and number2 are equally close to 10");
            System.out.println("number1 = number2 = " + number1);
        } else if (number1 == 10) {
            System.out.println("number1 = 10");
        } else if (number2 == 10) {
            System.out.println("number2 = 10");
        } else if (Math.abs(number1 - 10) < Math.abs(number2 - 10)) {
            System.out.println(number1 + " is closer to 10");
        } else if (Math.abs(number1 - 10) > Math.abs(number2 - 10)) {
            System.out.println(number2 + " is closer to 10");
        } else {
            System.out.println(number1 + " and " + number2 + " are equally close to 10");
        }
    }
}
