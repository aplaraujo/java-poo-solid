package org.example;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.0, 2.0, 4.0);

        circulo.inflar(2.0);

        System.out.println("Área: " + circulo.area());
        System.out.println("=======================");
        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("=======================");
        System.out.println(circulo);
    }
}