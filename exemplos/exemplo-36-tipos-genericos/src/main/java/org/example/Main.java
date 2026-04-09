package org.example;

import java.util.ArrayList;

public class Main {
    // Método genérico
    public static <T> void imprimirVetor(T[] vetor) {
        for (T item: vetor) {
            System.out.println(item);
        }
    }

    // Método genérico com limites
    public static <T extends Number> void imprimirNumeros(T[] numeros) {
        for (T numero : numeros) {
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        // Instância de classe genérica
        MinhaClasseGenerica<Integer> meuInteiro = new MinhaClasseGenerica<Integer>(100);
        MinhaClasseGenerica<String> meuString = new MinhaClasseGenerica<String>("Hello");

        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] blackPink = {"Jisoo", "Jennie", "Rosé", "Lisa"};

        System.out.println(meuInteiro.getItem());
        System.out.println(meuString.getItem());

        System.out.println("==========================");
        imprimirVetor(intArr);
        imprimirVetor(blackPink);

        System.out.println("==========================");
        imprimirNumeros(intArr);

        System.out.println("==========================");

        // Listas com eliminação de tipos
        ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);

        for(Integer inteiro: listaInteiros) {
            System.out.println(inteiro);
        }


    }
}