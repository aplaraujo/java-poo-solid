package org.example;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> minhaFila = new Fila<Integer>();

        minhaFila.enfileirar(1);
        minhaFila.enfileirar(2);
        minhaFila.enfileirar(3);
        minhaFila.enfileirar(4);
        minhaFila.enfileirar(5);


        System.out.println(minhaFila);

        System.out.println("=================");

        System.out.println("Primeiro da fila: " + minhaFila.desenfileirar());

        System.out.println("=================");
        System.out.println("Fila atualizada:");

        System.out.println(minhaFila);

        minhaFila.enfileirar(6);

        System.out.println("=================");
        System.out.println("Fila atualizada:");

        System.out.println(minhaFila);

        System.out.println("=================");

        System.out.println("Primeiro da fila: " + minhaFila.primeiroDaFila());

    }
}