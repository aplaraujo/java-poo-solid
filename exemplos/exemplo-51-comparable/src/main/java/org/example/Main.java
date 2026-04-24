package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> nossaLista = new ArrayList<>();
        nossaLista.add(new Pessoa("Mariazinha", 15));
        nossaLista.add(new Pessoa("Joãozinho", 12));
        nossaLista.add(new Pessoa("Ritinha", 17));
        nossaLista.add(new Pessoa("Aninha", 12));
        nossaLista.add(new Pessoa("Zequinha", 10));
        nossaLista.add(new Pessoa("Larissinha", 18));

        System.out.println("========================");
        System.out.println("==== Lista sem ordem ===");

        System.out.println(nossaLista);

        Collections.sort(nossaLista);

        System.out.println("=======================");
        System.out.println("==== Lista ordenada ===");

        System.out.println(nossaLista);
    }
}