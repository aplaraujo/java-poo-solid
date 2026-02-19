package org.example;

public class Cilindro {
    private final double pi = 3.14;
    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double areaLateral() {
        return 2 * pi * this.raio * this.altura;
    }

    public double areaTotal() {
        return (2 * (pi * Math.pow(this.raio, 2))) + (2 * (pi * this.raio * this.altura));
    }

    public double volume() {
        return pi * Math.pow(this.raio, 2) * altura;
    }
}
