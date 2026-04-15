package org.example;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada minhaLista = new ListaEncadeada();
        minhaLista.inserirNoInicio(1);
        minhaLista.inserirNoInicio(2);
        minhaLista.inserirNoInicio(3);
        minhaLista.inserirNoInicio(4);
        minhaLista.inserirNoInicio(5);

        minhaLista.remover(3);

        System.out.println("Elemento da lista: " + minhaLista.buscarElemento(4));
        System.out.println(minhaLista);
    }
}