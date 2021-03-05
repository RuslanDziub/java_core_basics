package com.company.core.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (!list.contains("break")) {
            list.add(scanner.next());
        }

        System.out.println("All words, that start with 's': ");
        for (String word : list) {
            if (word.startsWith("s")) {
                System.out.println(word);
            }
        }
        System.out.println();

        for (String word : list) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }
    }
}
