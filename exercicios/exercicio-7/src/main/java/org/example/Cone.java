package org.example;

public class Cone {
    private final double PI = 3.14;
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

    public double geratriz() {
        return Math.sqrt(Math.pow(this.raio, 2) + Math.pow(this.altura, 2));
    }

    public double areaLateral() {
        return PI * this.raio * this.geratriz();
    }

    public double areaTotal() {
        return PI * this.raio * (this.raio + this.geratriz());
    }

    public double volume() {
        return (PI * Math.pow(this.raio, 2) * this.altura) / 3;
    }
}
