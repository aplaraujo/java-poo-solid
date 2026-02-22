package org.example;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("John", 3.5);
        Student s2 = new Student(s);

        s.setName("Sarah");

        System.out.println("Original: " + s.getName());
        System.out.println("Clone: " + s2.getName());
    }
}