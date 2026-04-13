package org.example;

public class Pilha {
    private int topo;
    private int[] lista;

    public Pilha(int tamanho) {
        topo = -1;
        lista = new int[tamanho];
    }

    public int getTopo() {
        return topo;
    }

    public int[] getLista() {
        return lista;
    }

    public void empilhar(int elemento) {
        if (verificarPilhaCheia()) {
            topo++;
            lista[topo] = elemento;
        }
    }

    public void desempilhar() {
        if (verificarPilhaVazia()) {
            topo--;
        }
    }

    public int retornarElementoNoTopoDaPilha() {
        return lista[topo];
    }

    public boolean verificarPilhaVazia() {
        if (topo == -1) {
            System.out.println("Pilha vazia");
            return false;
        }
        return true;
    }

    public boolean verificarPilhaCheia() {
        if (topo == lista.length - 1) {
            System.out.println("Pilha cheia");
            return false;
        }
        return true;
    }

    public void imprimirPilha() {
        for(int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
