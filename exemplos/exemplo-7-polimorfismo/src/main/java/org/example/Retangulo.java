package org.example;

public class Retangulo extends Forma implements Area{
    public Retangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obterArea() {
        return this.getBase() * this.getAltura();
    }
}
