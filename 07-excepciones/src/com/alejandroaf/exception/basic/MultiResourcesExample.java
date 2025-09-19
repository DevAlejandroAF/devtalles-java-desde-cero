package com.alejandroaf.exception.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultiResourcesExample {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"));
                BufferedReader reader2 = new BufferedReader(new FileReader("src/example-2.txt"));
                ) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            System.out.println("Reader 2: " + reader2.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        }
    }
}
