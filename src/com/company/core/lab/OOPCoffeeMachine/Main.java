package com.company.core.lab.OOPCoffeeMachine;

import com.company.core.lab.OOPCoffeeMachine.CoffiMachines.CoffeeGrinder;
import com.company.core.lab.OOPCoffeeMachine.CoffiMachines.CoffeeMaker;
import com.company.core.lab.OOPCoffeeMachine.CoffiMachines.LateMachine;

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
