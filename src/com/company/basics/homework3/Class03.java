package com.company.basics.homework3;

public class Class03 {
    public static void main(String[] args) {
        int element = 90;
        int i = 1;

        while (element >= 0) {
            System.out.println("#" + i + " = " + element);
            element -= 5;
            i++;
        }
    }
}
