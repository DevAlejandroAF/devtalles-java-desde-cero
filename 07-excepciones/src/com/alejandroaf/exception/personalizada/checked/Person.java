package com.alejandroaf.exception.personalizada.checked;

public class Person {
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static Person createPerson(String name, Integer age) throws AgeValidationException {
        if (age < 18 ) {
            throw new AgeValidationException("Debés ser mayor de edad");
        }
        return new Person(age, name);
    }
}
