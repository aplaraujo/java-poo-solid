package org.example;

public class No {
    private int conteudo;
    private No proximo;

    public No() {
    }

    public No(int conteudo) {
        this.proximo = null;
        this.conteudo = conteudo;
    }

    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Nó: {" +
                "conteudo=" + conteudo +
                '}';
    }
}
