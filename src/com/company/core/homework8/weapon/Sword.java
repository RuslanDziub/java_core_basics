package com.company.core.homework8.weapon;

public class Sword extends Weapon {
    public Sword(int damage) {
        this.damage = damage;
    }

    @Override
    public int apply() {
        System.out.println("Shuhhhh!");
        return this.damage;
    }
}
