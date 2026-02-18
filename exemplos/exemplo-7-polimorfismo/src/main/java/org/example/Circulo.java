package org.example;

public class Circulo implements Area{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        double PI = 3.14159;
        return PI * Math.pow(this.getRaio(), 2);
    }
}
