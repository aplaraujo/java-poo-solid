package org.example;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novo) {
        if (atual == null) return novo;
        else if (novo.getConteudo().compareTo(atual.getConteudo()) < 0) atual.setEsquerda(inserir(atual.getEsquerda(), novo));
        else atual.setDireita(inserir(atual.getDireita(), novo));
        return atual;
    }

    public void exibicaoEmOrdem() {
        System.out.print("\n Exibição em ordem ");
        exibicaoEmOrdem(this.raiz);
    }

    private void exibicaoEmOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibicaoEmOrdem(atual.getEsquerda());
            System.out.print(atual.getConteudo() + ", ");
            exibicaoEmOrdem(atual.getDireita());
        }
    }

    public void exibicaoPosOrdem() {
        System.out.print("\n Exibição pós-ordem ");
        exibicaoPosOrdem(this.raiz);
    }

    private void exibicaoPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibicaoPosOrdem(atual.getEsquerda());
            exibicaoPosOrdem(atual.getDireita());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibicaoPreOrdem() {
        System.out.print("\n Exibição pré-ordem ");
        exibicaoPreOrdem(this.raiz);
    }

    private void exibicaoPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibicaoPreOrdem(atual.getEsquerda());
            exibicaoPreOrdem(atual.getDireita());
        }
    }

    public void remover(T conteudo) {
        try {

            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while ((atual != null) && (!atual.getConteudo().equals(conteudo))) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getEsquerda();
                } else {
                    atual = atual.getDireita();
                }
            }

            if (atual == null) System.out.println("Conteúdo não encontrado. Bloco Try");

            if (pai == null) {
                if (atual.getDireita() == null) {
                    this.raiz = atual.getEsquerda();
                } else if (atual.getEsquerda() == null) {
                    this.raiz = atual.getDireita();
                } else {
                    for (temp = atual, filho = atual.getEsquerda(); filho.getDireita() != null; temp = filho, filho = filho.getEsquerda()) {
                        if (filho != atual.getEsquerda()) {
                            temp.setDireita(filho.getEsquerda());
                            filho.setEsquerda(raiz.getEsquerda());
                        }
                    }
                    filho.setDireita(raiz.getDireita());
                    raiz = filho;
                }
            } else if (atual.getDireita() == null) {
                if (pai.getEsquerda() == atual) pai.setEsquerda(atual.getEsquerda());
                else pai.setDireita(atual.getEsquerda());
            } else if (atual.getEsquerda() == null) {
                if (pai.getEsquerda() == atual) pai.setEsquerda(atual.getDireita());
                else pai.setDireita(atual.getDireita());
            } else {
                for (temp = atual, filho = atual.getEsquerda(); filho.getDireita() != null; temp = filho, filho = filho.getDireita()) {
                    if (filho != atual.getEsquerda()) {
                        temp.setDireita(filho.getEsquerda());
                        filho.setEsquerda(atual.getEsquerda());
                    }
                    filho.setDireita(atual.getEsquerda());
                    if (pai.getEsquerda() == atual) pai.setEsquerda(filho);
                    else pai.setDireita(filho);
                }
            }

        } catch (NullPointerException erro) {
            System.out.println("Conteúdo não encontrado. Bloco catch");
        }

    }
}
