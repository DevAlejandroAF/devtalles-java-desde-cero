package com.devtalles.estructurasdedatos.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Ana");
        names.add("Juan");
        names.add("Carlos");

        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A") || name.startsWith("C")) {
                iterator.remove();
            }
        }

        System.out.println(names);
    }
}
