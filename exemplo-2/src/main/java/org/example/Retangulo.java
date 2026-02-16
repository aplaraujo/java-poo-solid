package org.example;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }
}
