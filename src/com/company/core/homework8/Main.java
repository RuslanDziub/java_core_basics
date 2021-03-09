package com.company.core.homework8;

import com.company.core.homework8.warriors.Ivango;
import com.company.core.homework8.warriors.RobinHood;
import com.company.core.homework8.warriors.Torus;
import com.company.core.homework8.warriors.Warriors;
import com.company.core.homework8.weapon.Ax;
import com.company.core.homework8.weapon.Bow;
import com.company.core.homework8.weapon.Sword;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Bow bow = new Bow(5);
        Sword sword = new Sword(10);
        Ax ax = new Ax(15);

        RobinHood robinHood = new RobinHood(100, bow);
        Ivango ivango = new Ivango(100, sword);
        Torus torus = new Torus(100, ax);

//        System.out.println("RobinGood attack Ivango\nIvango hp = " + ivango.getHp());
//        robinHood.attack(ivango);
//        System.out.println("RobinGood attack Ivango\nIvango hp = " + ivango.getHp());

        Warriors[] warriors = new Warriors[3];
        warriors[0] = robinHood;
        warriors[1] = ivango;
        warriors[2] = torus;

        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        System.out.println(i);
    }

    public static void fight(Warriors[] warriors) {

    }
}
