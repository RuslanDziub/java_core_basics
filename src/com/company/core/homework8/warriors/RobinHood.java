package com.company.core.homework8.warriors;

import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Weapon;

public class RobinHood extends Warriors {

    public RobinHood (int hp, Bow bow) {
        this.hp = hp;
        this.weapon = bow;
    }

    @Override
    public void attack(Warriors warriors) {
        warriors.hp -= this.weapon.apply();
    }
}
