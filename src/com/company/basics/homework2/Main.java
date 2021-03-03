package com.company.basics.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("r = ");
        double r = scanner.nextDouble();
        double pi = 3.14;
        double S = pi * Math.pow(r, 2);
        double l = 2 * pi * r;

        System.out.println("S = " + S);
        System.out.println("l = " + l);
    }
}
