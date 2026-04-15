package org.example;

public class Arvore {
    private Folha folha;
    private Arvore direita;
    private Arvore esquerda;

    public Arvore() {
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public Arvore(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean estaVazia() {
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if (estaVazia()) {
            this.folha = novo;
        } else {
            Arvore arvore = new Arvore(novo);

            if (novo.getValor() < this.folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = arvore;
                    System.out.println("Folha: " + novo.getValor() + " à esquerda de: " + this.folha.getValor());
                } else {
                    this.esquerda.inserir(novo);
                }
            } else if (novo.getValor() > this.folha.getValor()) {
                if (this.direita == null) {
                    this.direita = arvore;
                    System.out.println("Folha: " + novo.getValor() + " à direita de: " + this.folha.getValor());
                } else {
                    this.direita.inserir(novo);
                }
            }
        }

    }
}
