package org.example;

public class Reta {
    private double a;
    private double b;

    public Reta(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Reta(Ponto p1, Ponto p2) {
        this.a = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        this.b = p1.getY() - this.a * p1.getX();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public boolean verificar(Ponto p) {
        return Math.abs(p.getY() - (this.a * p.getX() + this.b)) < 1e-9;
    }

    public Ponto intersecao(Reta r) {
        if (this.a == r.a) return null;

        double x = (r.b - this.b) / (this.a - r.a);
        double y = this.a * x + this.b;
        return new Ponto(x, y);
    }

    @Override
    public String toString() {
        return "y = " + a + "x + " + b;
    }
}
