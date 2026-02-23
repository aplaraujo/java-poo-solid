package org.example;

public class Student {
    private String name;
    private double gpa;
    private Address address;

    public Student(String name, double gpa, Address address) {
        this.name = name;
        this.gpa = gpa;
        this.address = address;
    }

    public Student(Student s) {
        this.name = s.name;
        this.gpa = s.gpa;
        this.address = new Address(s.getAddress().getPostalCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
