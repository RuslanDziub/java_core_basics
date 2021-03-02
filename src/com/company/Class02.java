package com.company;

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        int numberOfPositive = 0;
        int numberOfNegative = 0;
        int numberOfZero = 0;

        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                numberOfPositive++;
            } else if (number < 0) {
                numberOfNegative++;
            } else {
                numberOfZero++;
            }
        }

        System.out.println("The number of positive numbers: " + numberOfPositive);
        System.out.println("The number of negative numbers: " + numberOfNegative);
        System.out.println("The number of zero numbers: " + numberOfZero);
    }
}
