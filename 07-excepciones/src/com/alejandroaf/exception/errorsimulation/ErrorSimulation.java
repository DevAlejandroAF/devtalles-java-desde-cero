package com.alejandroaf.exception.errorsimulation;

public class ErrorSimulation {
    public static void causeError() {
        throw new RuntimeException("Se ha producido un error crítico!");
    }

    public static void simulateError() {
        causeError();
    }

    public static void main(String[] args) {
        try {
            simulateError();
        } catch (RuntimeException e) {
            System.out.println("Error detectado: " + e.getMessage());
            System.out.println("Detalles del error: ");
            e.printStackTrace();
        }
    }
}
