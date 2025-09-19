package com.alejandroaf.exception.basic;

public class Main {
    public static void main(String[] args) {
        try {
            int n = 10/0;
            System.out.printf("Resultado: %d", n);
        } catch (ArithmeticException e) {
            System.out.println("Error división por cero");
        } finally {
            System.out.println("Se ejecuta siempre");
        }
    }
}
