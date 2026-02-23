package org.example;

import java.util.Objects;

public class Ponto2D {
    private Double x;
    private Double y;

    public Ponto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Ponto2D(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double distancia(Ponto2D ponto) {
        return Math.sqrt(Math.pow(ponto.x - this.x, 2) + Math.pow(ponto.y - this.y, 2));
    }

    public void mover() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void mover(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public Ponto2D clone() {
        return new Ponto2D(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ponto2D ponto2D = (Ponto2D) o;
        return Objects.equals(x, ponto2D.x) && Objects.equals(y, ponto2D.y);
    }

    @Override
    public String toString() {
        return "Ponto2D {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
