package org.example;

public class No {
    private int item;
    private No proximo;

    public No(int valor) {
        this.item = valor;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public void mostrar() {
        System.out.println(this.item + " -> ");
    }
}
