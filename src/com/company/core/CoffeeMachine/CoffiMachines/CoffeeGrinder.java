package com.company.core.CoffeeMachine.CoffiMachines;

public class CoffeeGrinder {
    private int speed = 1;

    public void grindCoffee () {
        System.out.println("Speed: " + this.speed);
        System.out.println("I grind coffee");
    }

    public void grindCoffee (int speed) {
        this.speed = speed;
        switch (this.speed) {
            case 1: {
                System.out.println("Speed: " + this.speed);
                System.out.println("I grind coffee");
                break;
            }
            case 2: {
                System.out.println("Speed: " + this.speed);
                System.out.println("I grind coffee");
                break;
            }
            case 3: {
                System.out.println("Speed: " + this.speed);
                System.out.println("I grind coffee");
                break;
            }
            default: {
                System.out.println("Error speed!");
                break;
            }
        }
    }
}
