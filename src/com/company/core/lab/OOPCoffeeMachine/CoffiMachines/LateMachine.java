package com.company.core.lab.OOPCoffeeMachine.CoffiMachines;

public class LateMachine extends CoffeeGrinder {
    private String lateSize = "L";

    public void grindCoffee (String lateSize) {
        this.lateSize = lateSize;

        switch (this.lateSize) {
            case "S": {
                System.out.println("late size: " + this.lateSize);
                System.out.println("I grind coffee");
                break;
            }
            case "L": {
                System.out.println("late size: " + this.lateSize);
                System.out.println("I grind coffee");
                break;
            }
            case "XL": {
                System.out.println("late size: " + this.lateSize);
                System.out.println("I grind coffee");
                break;
            }
            default: {
                System.out.println("Error late size!");
                break;
            }
        }
    }

    public void makeLate () {
        System.out.println("I make late");
    }
}
