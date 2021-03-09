package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Ax;
import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Weapon;

public class Torus extends Warriors {

    public Torus (int hp, Ax ax) {
        this.hp = hp;
        this.weapon = ax;
    }

    @Override
    public void attack(Warriors warriors) {
        warriors.hp -= this.weapon.apply();
    }
}
