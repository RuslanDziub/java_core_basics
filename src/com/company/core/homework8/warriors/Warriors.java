package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Weapon;

public abstract class Warriors {
    protected int hp;
    protected Weapon weapon;

    public int getHp() { return this.hp; }

    public abstract void attack (Warriors warriors);
}
