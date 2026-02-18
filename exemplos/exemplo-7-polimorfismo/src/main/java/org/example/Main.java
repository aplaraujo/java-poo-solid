package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        Triangulo triangulo = new Triangulo(A, C);
        Circulo circulo = new Circulo(C);
        Trapezio trapezio = new Trapezio(A, B, C);
        Quadrado quadrado = new Quadrado(B);
        Retangulo retangulo = new Retangulo(A, B);

        System.out.println(String.format("TRIANGULO: %.3f", triangulo.obterArea()));
        System.out.println(String.format("CIRCULO: %.3f", circulo.obterArea()));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio.obterArea()));
        System.out.println(String.format("QUADRADO: %.3f", quadrado.obterArea()));
        System.out.println(String.format("RETANGULO: %.3f", retangulo.obterArea()));


        sc.close();
    }
}