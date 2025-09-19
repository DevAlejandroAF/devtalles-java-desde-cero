package com.alejandroaf.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
     public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"));) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
}
