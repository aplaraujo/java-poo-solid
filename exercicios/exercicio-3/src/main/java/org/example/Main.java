package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Esfera esfera = new Esfera();

        double raio = sc.nextDouble();
        esfera.setRaio(raio);

        if (esfera.getRaio() < 0) {
            System.out.println("O valor do raio não pode ser negativo!");
        } else {
            System.out.println(String.format("Valor da área: %.2f", esfera.area()));
            System.out.println(String.format("Valor do volume: %.2f", esfera.volume()));
        }

        sc.close();
    }
}