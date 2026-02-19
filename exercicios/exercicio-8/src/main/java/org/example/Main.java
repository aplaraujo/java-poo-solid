package org.example;

public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("Mariazinha", 40, 1.55);

        System.out.println("IMC: " + p1.calcularIMC());
        System.out.println(p1.getFaixaDeRisco());

    }
}