package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Weapon;

public class RobinHood extends Warriors {

    public RobinHood (int hp, Bow bow) {
        super(hp, bow);
    }

    @Override
    public void showWarriors () {
        System.out.println("Robin Hood");
        System.out.println("hp : " + this.hp);
        System.out.print("Weapon : ");
        this.weapon.showWeapon();
    }

    @Override
    public void attack(Warriors warriors) {
        warriors.hp -= this.weapon.apply();
    }
}
