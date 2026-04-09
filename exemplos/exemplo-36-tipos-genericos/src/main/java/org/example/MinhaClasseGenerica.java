package org.example;

// Classe genérica
public class MinhaClasseGenerica<T> {
    private T item;

    public MinhaClasseGenerica(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
