package org.example;

public class Main {
    public static void main(String[] args) {
        Paralelepipedo p1 = new Paralelepipedo();
        p1.setAltura(26);
        p1.setLargura(12);
        p1.setComprimento(16);

        System.out.println("Área: " + p1.area());
        System.out.println("Volume: " + p1.volume());
    }
}