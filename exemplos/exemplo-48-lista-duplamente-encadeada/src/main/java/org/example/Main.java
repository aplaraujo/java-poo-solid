package org.example;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> nossaLista = new ListaDuplamenteEncadeada<>();

        nossaLista.add("Fouli");
        nossaLista.add("Caeki");
        nossaLista.add("Tozog");
        nossaLista.add("Plama");
        nossaLista.add("Rusi");
        nossaLista.add("Sega");
        nossaLista.add("Quoso");
        nossaLista.add("Poali");

        System.out.println(nossaLista);

        nossaLista.remove(3);

        System.out.println("========================");
        System.out.println("==== Lista alterada ====");

        System.out.println(nossaLista);

        nossaLista.add(3, "Bredo");

        System.out.println("========================");
        System.out.println("==== Lista alterada ====");

        System.out.println(nossaLista);

        System.out.println("========================");
        System.out.println(nossaLista.get(3));
    }
}