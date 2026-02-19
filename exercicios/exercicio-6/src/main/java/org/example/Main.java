package org.example;

public class Main {
    public static void main(String[] args) {
        Cilindro c1 = new Cilindro();
        c1.setRaio(-2);
        c1.setAltura(-4);

        if (c1.getRaio() < 0 && c1.getAltura() < 0) {
            throw new RuntimeException("O raio e a altura não podem ser negativos");
        }

        System.out.println("Área lateral: " + c1.areaLateral());
        System.out.println("Área total: " + c1.areaTotal());
        System.out.println("Volume: " + c1.volume());
    }
}