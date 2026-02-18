package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, altura;
        largura = sc.nextDouble();
        altura = sc.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(altura);
        retangulo.setLargura(largura);

        System.out.println("Área: " + retangulo.area());
        System.out.println("Diagonal: " + retangulo.diagonal());

        sc.close();
    }
}