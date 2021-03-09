package com.company.core.homework8.weapon;

public class Bow extends Weapon {
    public Bow(int damage) {
        this.damage = damage;
    }

    @Override
    public int apply() {
        System.out.println("Pih-pah!");
        return this.damage;
    }
}
