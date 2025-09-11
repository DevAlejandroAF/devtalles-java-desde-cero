package com.devtalles.estructurasdedatos.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("Tokyo");
        cities.add("Los Angeles");
        cities.add("Barcelona");

        ((LinkedList<String>)cities).addFirst("London");
        cities.removeFirst();

        System.out.println(cities);
    }
}
