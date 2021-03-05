package com.company.core.homework7.task3;

import com.company.core.homework7.task3.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("leopard", 20, 7);

        System.out.println("Name of the animal = " + animal.getName() + ", Animal speed = " +
                            animal.getSpeed() + " km/h, Age of the animal = " + animal.getAge() + " years");

        animal.setName("Bull");
        animal.setSpeed(2);
        animal.setAge(14);

        System.out.println("Name of the animal = " + animal.getName() + ", Animal speed = " +
                            animal.getSpeed() + " km/h, Age of the animal = " + animal.getAge() + " years");
    }
}
