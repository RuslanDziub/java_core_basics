package com.company.core.homework6;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4, 6.3);

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.6);

        System.out.println("S rectangle1 = " + rectangle1.S());
        System.out.println("P rectangle1 = " + rectangle1.P());
        System.out.println("S rectangle2 = " + rectangle2.S());
        System.out.println("P rectangle2 = " + rectangle2.P());

        System.out.println("S circle1 = " + circle1.S());
        System.out.println("l circle1 = " + circle1.l());
        System.out.println("S circle2 = " + circle2.S());
        System.out.println("l circle2 = " + circle2.l());
    }
}
