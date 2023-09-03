package org.example;

public class Student {
    private Long id;
    private String name;
    private int age;

    public Student( String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "id: " + id +
                "\n name=: " + name +
                " age: " + age ;
    }
}
