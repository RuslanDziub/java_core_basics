package com.company.core.homework9.task2;

import com.company.core.homework9.task2.second.MyCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. a + b");
        System.out.println("2. a - b");
        System.out.println("3. a * b");
        System.out.println("4. a / b");
        System.out.println("Print a, b and enter operation");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("Enter operation: ");
        int operation = scanner.nextInt();
        switch (operation) {
            case 1: {
                System.out.println("a + b = " + myCalculator.plus(a, b));
                break;
            }
            case 2: {
                System.out.println("a - b = " + myCalculator.minus(a, b));
                break;
            }
            case 3: {
                System.out.println("a * b = " + myCalculator.multiply(a, b));
                break;
            }
            case 4: {
                System.out.println("a / b = " + myCalculator.devide(a, b));
                break;
            }
            default: {
                System.out.println("Unknown operation!");
            }
        }
    }
}
