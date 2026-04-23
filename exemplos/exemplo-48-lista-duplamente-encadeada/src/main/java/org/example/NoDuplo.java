package org.example;

public class NoDuplo<T> {
    private T conteudo;
    private NoDuplo<T> proximo; // Referência para o próximo nó
    private NoDuplo<T> anterior; // Referência para o nó anterior

    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nó duplo: [" + "conteudo = " + conteudo + "]";
    }
}
