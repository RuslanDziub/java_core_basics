package com.company.core.homework7.task3.animal;

public class Animal {
    private String name;
    private int speed;
    private int age;

    public Animal (String name, int speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public void setName (String name) { this.name = name; }

    public String getName () { return this.name; }

    public void setSpeed (int speed) { this.speed = speed; }

    public int getSpeed () { return this.speed; }

    public void setAge (int age) { this.age = age; }

    public int getAge () { return this.age; }
}
