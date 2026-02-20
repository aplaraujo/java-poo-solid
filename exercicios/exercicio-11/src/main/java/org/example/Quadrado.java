package org.example;

public class Quadrado extends FormaGeometrica {
    private Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Math.round(Math.pow(this.lado, 2) * 10.0) / 10.0;
    }
}
