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

        System.out.println("============================================================================");
        System.out.println("Warriors 1");
        robinHood.showWarriors();
        System.out.println("============================================================================");
        System.out.println("Warriors 2");
        ivango.showWarriors();
        System.out.println("============================================================================");
        System.out.println("Warriors 3");
        torus.showWarriors();
        System.out.println("============================================================================");

        Warriors[] warriors = new Warriors[3];
        warriors[0] = robinHood;
        warriors[1] = ivango;
        warriors[2] = torus;

        fight(warriors);
    }

    public static int randFight(int max) {
        int min = 1;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public static void fight(Warriors[] warriors) {
        System.out.println("Fight!!!");
        System.out.println("============================================================================");
        while(warriors[0].getHp() > 0 && warriors[1].getHp() > 0 && warriors[2].getHp() > 0) {
            int number = randFight(6);
            switch (number) {
                case 1:
                {
                    System.out.println("Robin Hood attack Ivango");
                    warriors[0].attack(warriors[1]);
                    System.out.println("Ivango hp : " + warriors[1].getHp());
                    break;
                }
                case 2:
                {
                    System.out.println("Robin Hood attack Torus");
                    warriors[0].attack(warriors[2]);
                    System.out.println("Torus hp : " + warriors[2].getHp());
                    break;
                }
                case 3:
                {
                    System.out.println("Ivango attack Robin Hood");
                    warriors[1].attack(warriors[0]);
                    System.out.println("Robin Hood hp : " + warriors[0].getHp());
                    break;
                }
                case 4:
                {
                    System.out.println("Ivango attack Torus");
                    warriors[1].attack(warriors[2]);
                    System.out.println("Torus hp : " + warriors[2].getHp());
                    break;
                }
                case 5:
                {
                    System.out.println("Torus attack Robin Hood");
                    warriors[2].attack(warriors[0]);
                    System.out.println("Robin Hood hp : " + warriors[0].getHp());
                    break;
                }
                case 6:
                {
                    System.out.println("Torus attack Ivango");
                    warriors[2].attack(warriors[1]);
                    System.out.println("Ivango hp : " + warriors[1].getHp());
                    break;
                }
            }
            System.out.println("============================================================================");
            if (warriors[0].getHp() <= 0) {
                System.out.println("Robin Hood lost!");
                while(warriors[1].getHp() > 0 && warriors[2].getHp() > 0) {
                    number = randFight(2);
                    switch (number) {
                        case 1:
                        {
                            System.out.println("Ivango attack Torus");
                            warriors[1].attack(warriors[2]);
                            System.out.println("Torus hp : " + warriors[2].getHp());
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Torus attack Ivango");
                            warriors[2].attack(warriors[1]);
                            System.out.println("Ivango hp : " + warriors[1].getHp());
                            break;
                        }
                    }
                    System.out.println("============================================================================");
                    if(warriors[1].getHp() <= 0) {
                        System.out.println("Ivango lost!");
                        System.out.println("Torus won! hp : " + warriors[2].getHp());
                    }
                }
            } else if (warriors[1].getHp() <= 0) {
                System.out.println("Ivango lost!");
                while(warriors[0].getHp() > 0 && warriors[2].getHp() > 0) {
                    number = randFight(2);
                    switch (number) {
                        case 1:
                        {
                            System.out.println("Robin Hood attack Torus");
                            warriors[0].attack(warriors[2]);
                            System.out.println("Torus hp : " + warriors[2].getHp());
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Torus attack Robin Hood");
                            warriors[2].attack(warriors[0]);
                            System.out.println("Robin Hood hp : " + warriors[0].getHp());
                            break;
                        }
                    }
                    System.out.println("============================================================================");
                    if(warriors[0].getHp() <= 0) {
                        System.out.println("Robin Hood lost!");
                        System.out.println("Torus won! hp : " + warriors[2].getHp());
                    }
                }
            } else if (warriors[2].getHp() <= 0) {
                System.out.println("Torus lost!");
                while(warriors[0].getHp() > 0 && warriors[1].getHp() > 0) {
                    number = randFight(2);
                    switch (number) {
                        case 1:
                        {
                            System.out.println("Robin Hood attack Ivango");
                            warriors[0].attack(warriors[1]);
                            System.out.println("Ivango hp : " + warriors[1].getHp());
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Ivango attack Robin Hood");
                            warriors[1].attack(warriors[0]);
                            System.out.println("Robin Hood hp : " + warriors[0].getHp());
                            break;
                        }
                    }
                    System.out.println("============================================================================");
                    if(warriors[0].getHp() <= 0) {
                        System.out.println("Robin Hood lost!");
                        System.out.println("Ivango won! hp : " + warriors[2].getHp());
                    }
                }
            }
        }
    }
}
