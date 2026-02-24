package org.example;

public class Main {
    public static void main(String[] args) {
        Continente continente = new Continente("América Latina");
        Pais brasil = new Pais("Brasil", 213421037L, 8510417.771);
        Pais argentina = new Pais("Argentina", 46735004L, 2780.400);
        Pais paraguai = new Pais("Paraguai", 6109644L,  406.752);
        continente.incluirPais(brasil);
        continente.incluirPais(argentina);
        continente.incluirPais(paraguai);

        System.out.println("=================================");
        System.out.println(continente);
        System.out.println("Dimensão total: " + continente.dimensaoTotal());
        System.out.println("População total: " + continente.populacaoTotal());
        System.out.println("Dimensão do maior país: " + continente.paisMaiorDimensao());
        System.out.println("Dimensão do menor país: " + continente.paisMenorDimensao());
    }
}