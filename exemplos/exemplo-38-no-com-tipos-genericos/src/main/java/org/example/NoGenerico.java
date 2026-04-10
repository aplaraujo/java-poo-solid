package org.example;

public class NoGenerico<T> {
    private T item;
    private NoGenerico proximo;

    public NoGenerico(T item) {
        this.proximo = null;
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public NoGenerico getProximo() {
        return proximo;
    }

    public void setProximo(NoGenerico proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Nó Generico: {" +
                "item = " + item +
                '}';
    }
}
