package org.example;

public class Quadrado implements Area{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        return Math.pow(this.getLado(), 2);
    }
}
