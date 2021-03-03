package com.company;

import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter diapazon [a, b] numbers: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        int sum = 0;

        while (a > b) {
            System.out.println("Error! a > b!");
            System.out.println("Enter diapazon [a, b] numbers: ");
            System.out.print("a = ");
            a = scanner.nextInt();
            System.out.print("b = ");
            b = scanner.nextInt();
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.print("The sum of number in the range [a, b] = " + sum);
    }
}
