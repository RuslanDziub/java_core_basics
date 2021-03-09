package com.company.core.homework8.weapon;

public class Ax extends Weapon {
    public Ax(int damage) {
        super(damage);
    }

    @Override
    public void showWeapon() {
        System.out.println("ax(" + this.damage + ")");
    }

    @Override
    public int apply() {
        System.out.println("Bahhh!");
        return this.damage;
    }
}
