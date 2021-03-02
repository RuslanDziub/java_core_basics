package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Print number: ");
        int number = scanner.nextInt();
        int k = 1;
        int sum = number;

        do {
            System.out.print("Print number: ");
            number = scanner.nextInt();
            k++;
            sum += number;
        } while (number != 0);

        System.out.println("Number of numbers: " + k);
        System.out.println("The sum of numbers: " + sum);
    }
}