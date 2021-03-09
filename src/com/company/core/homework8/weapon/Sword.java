package com.company.core.homework8.weapon;

public class Sword extends Weapon {
    public Sword(int damage) {
        super(damage);
    }

    @Override
    public void showWeapon() {
        System.out.println("sword(" + this.damage + ")");
    }

    @Override
    public int apply() {
        System.out.println("Shuhhhh!");
        return this.damage;
    }
}
