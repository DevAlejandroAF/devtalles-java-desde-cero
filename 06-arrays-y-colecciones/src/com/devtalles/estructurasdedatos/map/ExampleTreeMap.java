package com.devtalles.estructurasdedatos.map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new TreeMap<>();

        productPrices.put("Laptop", 999);
        productPrices.put("Smartphone", 799);
        productPrices.put("Tablet", 599);
        productPrices.put("Keyboard", 99);
        productPrices.put("Mouse", 49);

        System.out.println(productPrices.get("Laptop"));
    }
}
