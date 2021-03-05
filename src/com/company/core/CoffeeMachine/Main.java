package com.company.core.CoffeeMachine;

import com.company.core.CoffeeMachine.CoffiMachines.CoffeeGrinder;
import com.company.core.CoffeeMachine.CoffiMachines.CoffeeMaker;
import com.company.core.CoffeeMachine.CoffiMachines.LateMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeGrinder BOSH = new CoffeeGrinder();
        BOSH.grindCoffee(2);

        System.out.println("==================================");

        CoffeeMaker philips = new CoffeeMaker();
        philips.grindCoffee("light");
        philips.makeCoffee();

        System.out.println("==================================");

        LateMachine Delogi = new LateMachine();
        Delogi.grindCoffee("L");
        Delogi.makeLate();
    }
}
