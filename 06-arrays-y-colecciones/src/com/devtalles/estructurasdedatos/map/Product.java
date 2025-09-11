package com.devtalles.estructurasdedatos.map;

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main(String[] args) {
        Map<Product, Double> priceMap = new TreeMap<>();

        priceMap.put(new Product(191, "Laptop"), 999.0);
        priceMap.put(new Product(192, "Smartphone"), 799.0);
        priceMap.put(new Product(193, "Tablet"), 499.0);

        System.out.println(priceMap);

        priceMap.remove(new Product(191, "Laptop"));

        Product newProduct = new Product(194, "Keyboard");
        priceMap.put(newProduct, 199.0);
        System.out.println(priceMap);

        priceMap.remove(newProduct);

        System.out.println(priceMap);
    }
}
