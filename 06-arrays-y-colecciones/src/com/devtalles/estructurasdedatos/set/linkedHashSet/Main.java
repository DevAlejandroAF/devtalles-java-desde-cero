package com.devtalles.estructurasdedatos.set.linkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(20);

        System.out.println("Numbers: " + numbers);

        numbers.add(70);

        System.out.println(numbers);
    }
}
