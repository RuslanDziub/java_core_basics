package com.company.core.homework8.weapon;

public class Ax extends Weapon {
    public Ax(int damage) {
        this.damage = damage;
    }

    @Override
    public int apply() {
        System.out.println("Bahhh!");
        return this.damage;
    }
}
