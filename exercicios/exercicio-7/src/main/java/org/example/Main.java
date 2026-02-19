package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Cone cone = new Cone();
        cone.setRaio(5);
        cone.setAltura(8);

        if (cone.getRaio() < 0 && cone.getAltura() < 0) {
            throw new RuntimeException("Os valores do raio e da altura não devem ser negativos");
        }

        System.out.println("Geratriz: " + cone.geratriz());
        System.out.println("Area lateral: " + cone.areaLateral());
        System.out.println("Area total: " + cone.areaTotal());
        System.out.println("Volume: " + cone.volume());
    }
}