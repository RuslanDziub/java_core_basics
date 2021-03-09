package com.company.core.homework8.weapon;

public abstract class Weapon {
    protected int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() { return this.damage; }

    public abstract void showWeapon();
    public abstract int apply();
}
