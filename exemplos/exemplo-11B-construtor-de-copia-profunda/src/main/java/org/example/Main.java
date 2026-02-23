package org.example;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("John", 3.5, new Address(12345));
        Student s2 = new Student(s);

        s.getAddress().setPostalCode(54321);

        System.out.println("Original: " + s.getAddress().getPostalCode());
        System.out.println("Clone: " + s2.getAddress().getPostalCode());
    }
}