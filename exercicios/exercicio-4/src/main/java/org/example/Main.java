package org.example;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.setComprimento(5);
        ret.setLargura(4);

        System.out.println("Área: " + ret.area());
        System.out.println("Perímetro: " + ret.perimetro());
    }
}