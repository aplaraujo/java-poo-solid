package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome("Mariazinha");
        p1.setPeso(50);
        p1.setAltura(1.65);
        p1.setGenero("Feminino");
        System.out.println(p1);
        System.out.println(String.format("IMC: %.2f", p1.calcularIMC()));

        p2.setNome("Zequinha");
        p2.setPeso(80);
        p2.setAltura(1.85);
        p2.setGenero("Masculino");
        System.out.println(p2);
        System.out.println(String.format("IMC: %.2f", p2.calcularIMC()));
    }
}