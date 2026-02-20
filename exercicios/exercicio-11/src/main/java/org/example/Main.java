package org.example;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(12.0);
        Retangulo retangulo = new Retangulo(23.77, 10.97);
        Triangulo triangulo = new Triangulo(12.0, 9.0);
        Circulo circulo = new Circulo(6.0);

        System.out.println("Área do quadrado: " + quadrado.area());
        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Área do triângulo: " + triangulo.area());
        System.out.println("Área do círculo: " + circulo.area());
    }
}