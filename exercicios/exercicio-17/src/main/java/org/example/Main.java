package org.example;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("ISO 3166-1", "Brasil", 8515767.049);
        Pais argentina = new Pais("ISO 3166-2", "Argentina", 2780400.0);
        brasil.setPopulacao(211755692L);
        brasil.adicionarFronteira(argentina);


        System.out.println("==========================");
        System.out.println(brasil);
    }
}