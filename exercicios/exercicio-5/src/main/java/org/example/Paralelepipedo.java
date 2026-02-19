package org.example;

public class Paralelepipedo {
    private double altura;
    private double largura;
    private double comprimento;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double volume() {
        return this.comprimento * this.largura * this.altura;
    }

    public double area() {
        return (2 * (this.comprimento * this.largura)) + (2 * (this.largura * this.altura)) + (2 * (this.comprimento * this.altura));
    }
}
