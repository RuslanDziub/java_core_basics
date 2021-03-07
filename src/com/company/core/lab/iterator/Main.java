package com.company.core.lab.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(64);
        numbers.add(94);
        numbers.add(18);
        numbers.add(5);

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            numbers.set(listIterator.nextIndex(), listIterator.next() * 5 + 1);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
           int num = iterator.next();
           if (num > 300) {

           }
        }
    }
}
