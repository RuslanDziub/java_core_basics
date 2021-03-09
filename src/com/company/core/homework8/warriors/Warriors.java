package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Weapon;

public abstract class Warriors {
    protected int hp;
    protected Weapon weapon;

    public Warriors (int hp, Weapon weapon) {
        this.hp = hp;
        this.weapon = weapon;
    }

    public int getHp() { return this.hp; }

    public abstract void showWarriors ();
    public abstract void attack (Warriors warriors);
}
