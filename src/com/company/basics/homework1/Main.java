/*
Знайти розвязки квадратного рівняння
    ax^2 + bx + c = 0
Користувач вводить a, b, c і отримує розв'язки рівняння
або повідомлення, що їх нема.
 */

package com.company.basics.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\tax^2 + bx + c = 0");
        System.out.println("Enter the coefficients (a, b, c):");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - (4 * a * c);

        if (d < 0) {
            System.out.println("d < 0, Are not solutions!");
        } else {
            double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}