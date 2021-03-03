package com.company.core.homework5;

import java.util.Scanner;

public class Class02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array:");
        System.out.print("size = ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        array = fillArray(array);///////////////////////////////////
        showArray(array);
        reverseShowArray(array);
    }

    public static int[] fillArray (int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array element:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void showArray (int[] array) {
        System.out.println("This is your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }

    public static void reverseShowArray (int[] array) {
        System.out.println("This is your array reverse:");
        for (int i = array.length - 1; i  >= 0; i--) {
            System.out.print("\t" + array[i]);
        }
        System.out.println();
    }
}
