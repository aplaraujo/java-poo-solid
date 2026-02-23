package org.example;

public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(-5.0, 5.0);
        Ponto2D ponto2 = new Ponto2D(2.0, 1.0);
        Ponto2D ponto2D = new Ponto2D(ponto1);

        ponto2D.setX(4.0);
        ponto2D.setY(3.0);

        System.out.println("Plano 1: " + ponto1);
        System.out.println("Plano 2: " + ponto2);
        System.out.println("Plano 3: " + ponto2D);

        ponto1.mover(ponto2);
        ponto2.mover(ponto2D);

        System.out.println("------------------");
        System.out.println("Plano 1: " + ponto1);
        System.out.println("Plano 2: " + ponto2);

        System.out.println("------------------");
        System.out.println("Distância: " + ponto1.distancia(ponto2D));
    }
}