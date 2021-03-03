package com.company.core.homework5;

import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the money contribution: ");
        int m = scanner.nextInt();
        System.out.print("Enter the interest rate: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of years: ");
        int k = scanner.nextInt();

        for (int i = 0; i < k; i++) {
            double prubutok = m * n / 100;
            System.out.println(i + " year: " + prubutok);
            m += prubutok;
        }

        System.out.println("Profit for " + k + " years is " + m);
    }
}
