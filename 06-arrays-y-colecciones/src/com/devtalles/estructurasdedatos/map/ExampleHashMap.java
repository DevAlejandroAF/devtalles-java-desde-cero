package com.devtalles.estructurasdedatos.map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();

        productPrices.put("Laptop", 999);
        productPrices.put("Smartphone", 799);
        productPrices.put("Tablet", 599);

        System.out.println(productPrices.get("Laptop"));
    }
}
