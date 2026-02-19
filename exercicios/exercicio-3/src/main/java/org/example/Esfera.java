package org.example;

public class Esfera {
    private double raio;

    private final double PI = 3.14159;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area() {
        return 4 * PI * Math.pow(this.getRaio(), 2);
    }

    public double volume() {
       return ((double)4/3) * PI * Math.pow(this.getRaio(), 3);
    }
}
