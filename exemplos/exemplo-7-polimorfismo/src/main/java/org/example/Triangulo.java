package org.example;

public class Triangulo extends Forma implements Area {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double obterArea() {
        return (this.getBase()* this.getAltura()) / 2;
    }
}
