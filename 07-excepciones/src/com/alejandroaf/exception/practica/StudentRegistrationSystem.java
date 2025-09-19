package com.alejandroaf.exception.practica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {
    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {
        validateStudentData(name, age, id);
        if (isStudentRegistered(id)) {
            throw new DuplicateStudentException("El estudiante que intenta registrar ya existe.");
        }
        this.students.add(new Student(name, age, id));
        System.out.println("Usuario registrado correctamente.");
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacio.");
        }

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getID().equals(id)) {
                iterator.remove();
                System.out.println("El estudiante fue eliminado.");
                return;
            }
        }

        throw new StudentNotFoundException("El estudiante ingresado no existe");
    }

    public boolean isStudentRegistered(String id) {
        for (Student student : students) {
            if (student.getID().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void validateStudentData(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacio.");
        }
        if (age < 17 || age > 110) {
            throw new IllegalArgumentException("La edad debe estar en el rango de 18 a 110 años.");
        }
        if (!id.matches("^[A-Z]\\d{5}$")) {
            throw new IllegalArgumentException("El ID no cumple con un ID de estudiante");
        }
    }

    public static void main(String[] args) {
        StudentRegistrationSystem system = new StudentRegistrationSystem();

        try {
            system.registerStudent("Luis, Gomez", 25, "A12345");
        } catch (DuplicateStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
