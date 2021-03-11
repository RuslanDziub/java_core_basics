package com.company.core.lab.enums.test1;

public class Main {
    public static void main(String[] args) {
        for (Music music : Music.values()) {
            System.out.println(music.ordinal() + " " + music);
        }
    }
}
