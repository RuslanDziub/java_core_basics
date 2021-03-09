package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Ax;
import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Weapon;

public class Torus extends Warriors {

    public Torus (int hp, Ax ax) {
        super(hp, ax);
    }

    @Override
    public void showWarriors () {
        System.out.println("Torus");
        System.out.println("hp : " + this.hp);
        System.out.print("Weapon : ");
        this.weapon.showWeapon();
    }

    @Override
    public void attack(Warriors warriors) {
        warriors.hp -= this.weapon.apply();
    }
}
