package com.company.core.homework8.weapon;

public abstract class Weapon {
    protected int damage;

    public int getDamage() { return this.damage; }

    public abstract int apply();
}
