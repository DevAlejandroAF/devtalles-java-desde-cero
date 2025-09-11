package com.devtalles.estructurasdedatos.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
     public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(50);
        numbers.add(60);
        numbers.add(30);

        System.out.println(numbers);

        numbers.remove(20);

        System.out.println("Numbers: " + numbers);

        numbers.add(70);

        System.out.println(numbers);
    }
}
