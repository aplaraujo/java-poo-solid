package org.example;

public class No {
    private int valor; // Valor do nó
    private No proximo; // Referência para o próximo nó da lista

    // Define o valor do nó e inicializa next como null, pois ao ser criado, ele ainda não aponta para outro elemento
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "No {" +
                "valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}
