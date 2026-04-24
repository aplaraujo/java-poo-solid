package org.example;

public class BinNo<T extends Comparable<T>> {
    private T conteudo;
    private BinNo<T> esquerda;
    private BinNo<T> direita;

    public BinNo() {
    }

    public BinNo(T conteudo) {
        this.direita = null;
        this.esquerda = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(BinNo<T> esquerda) {
        this.esquerda = esquerda;
    }

    public BinNo<T> getDireita() {
        return direita;
    }

    public void setDireita(BinNo<T> direita) {
        this.direita = direita;
    }

    @Override
    public String toString() {
        return "Nó: [conteúdo = " + conteudo + "]";
    }
}
