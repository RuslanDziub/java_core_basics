package com.company.core.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 342, 12, 3, 12345, 42, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        List<String> words = new ArrayList<>();
        words.add("kjlkjlkj");
        words.add("kjkljlki");
        words.add("kjkljlkkldpsisdpoi");
        System.out.println(words.get(0));
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        words.add(1, "hello");
        words.remove(0);
        words.remove("hello");

        System.out.println(words);

        for (String str : words) {
            System.out.println(str);
        }

        System.out.println(words.indexOf("guyeurwqlkjf"));
        System.out.println(words.contains("hello"));
        System.out.println(words.contains("yeurwqlk"));
    }
}
