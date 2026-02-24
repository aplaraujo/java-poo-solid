package org.example;

public class Circulo {
    private double raio;
    private double xc;
    private double yc;

    public Circulo(double raio, double xc, double yc) {
        this.raio = raio;
        this.xc = xc;
        this.yc = yc;
    }

    public Circulo(double raio) {
        this.raio = raio;
        this.xc = 0;
        this.yc = 0;
    }

    public double getRaio() {
        return raio;
    }

    public void inflar(double valor) {
        this.raio += valor;
    }

    public void desinflar(double valor) {
        this.raio -= valor;
    }

    public void inflar() {
        this.raio++;
    }

    public void desinflar() {
        this.raio--;
    }

    public void mover() {
        this.xc = 0;
        this.yc = 0;
    }

    public void mover(double xc, double yc) {
        this.xc = xc;
        this.yc = yc;
    }

    public void mover(Ponto p) {
        this.xc = p.getX();
        this.yc = p.getY();
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo {" +
                "raio=" + raio +
                ", xc=" + xc +
                ", yc=" + yc +
                '}';
    }
}
