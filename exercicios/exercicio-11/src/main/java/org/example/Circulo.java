package org.example;

public class Circulo extends FormaGeometrica{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double PI = 3.14159;
        return Math.round((PI * Math.pow(this.raio, 2)) * 10.0) / 10.0;
    }
}
