package com.devtalles.estructurasdedatos.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John Doe");
        names.add("Jane Doe");
        names.add(2, "Peter Pan");
        names.set(2, "George");

        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names.contains("George"));
    }
}
