package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Sword;
import com.company.core.homework8.weapon.Weapon;

public class Ivango extends Warriors {

    public Ivango (int hp, Sword sword) {
        this.hp = hp;
        this.weapon = sword;
    }

    @Override
    public void attack (Warriors warriors) {
        warriors.hp -= this.weapon.apply();
    }
}
