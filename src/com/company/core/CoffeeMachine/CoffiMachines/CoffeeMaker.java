package com.company.core.CoffeeMachine.CoffiMachines;

public class CoffeeMaker extends CoffeeGrinder {
    private String grindingStrength = "medium";

    public void grindCoffee (String grindingStrength) {
        this.grindingStrength = grindingStrength;

        switch (this.grindingStrength) {
            case "light": {
                System.out.println("The strength of coffee: " + this.grindingStrength);
                System.out.println("I grind coffee");
                break;
            }
            case "medium": {
                System.out.println("The strength of coffee: " + this.grindingStrength);
                System.out.println("I grind coffee");
                break;
            }
            case "strong": {
                System.out.println("The strength of coffee: " + this.grindingStrength);
                System.out.println("I grind coffee");
                break;
            }
            default: {
                System.out.println("Error the strength of coffee!");
                break;
            }
        }
    }

    public void makeCoffee () {
        System.out.println("I make coffee");
    }
}
