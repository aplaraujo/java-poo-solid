package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Piramide p1 = new Piramide();
        p1.setAltura(4.0);
        p1.setBase(5.0);
        System.out.println(String.format("%.2f", p1.calcularVolume()));
    }
}