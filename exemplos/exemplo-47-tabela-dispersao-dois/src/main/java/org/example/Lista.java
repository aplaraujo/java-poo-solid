package org.example;

public class Lista {
    private No primeiro; // Primeiro nó da lista

    public Lista() {
        this.primeiro = null;
    }

    public boolean listaVazia() {
        return this.primeiro == null;
    }

    public  void inserir(int valor) {
        No lista = new No(valor);
        if (listaVazia()) {
            lista.setProximo(null);
            primeiro = lista;
            return;
        }
        No atual = primeiro;

        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            atual.setProximo(lista);
            lista.setProximo(null);
        }
    }

    public void imprimirLista() {
        No atual = primeiro;
        while (atual != null) {
            atual.mostrar();
            atual = atual.getProximo();
        }
    }

    public boolean buscarLista(int chave) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.getItem() == chave) return true;
            atual = atual.getProximo();
        }
        return false;
    }

    public void apagarLista(int valor) {
        if (!buscarLista(valor)) {
            System.out.println("Item não encontrado!!");
            return;
        }

        No anterior = primeiro;
        No atual = anterior;

        while (atual != null) {
            if (atual.getItem() == valor) break;
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == primeiro) primeiro = primeiro.getProximo();
        else anterior.setProximo(atual.getProximo());

    }
}
