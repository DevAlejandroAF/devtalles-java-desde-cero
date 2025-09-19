package com.alejandroaf.exception.autocloseable;

public class FakeDataBaseConnection implements AutoCloseable {
    public FakeDataBaseConnection() {
        System.out.println("Conexión a la base de datos establecida.");
    }

    public void fetchData() {
        System.out.println("Obteniendo información de la DB...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Conexión cerrada correctamente.");
    }
}
