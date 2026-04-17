package org.example;

public class Arvore<T extends Comparable> {
    // "Bolinha" principal
    private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public Elemento<T> getRaiz() {
        return raiz;
    }

    // Incluir um elemento na árvore
    public void adicionar(T valor) {
        Elemento<T> elemento = new Elemento<T>(valor);
        if (raiz == null) {
            this.raiz = elemento;
        } else {
            // Elemento atual (raiz da árvore)
            Elemento<T> atual = this.raiz;
            while(true) {
                // O novo elemento é menor do que o elemento atual? Se sim, ficará à esquerda
                if (elemento.getValor().compareTo(atual.getValor()) == -1) {
                    // O elemento atual tem um filho à esquerda?
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(elemento);
                        break;
                    }
                } else {
                    // O elemento atual tem um filho à direita?
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(elemento);
                        break;
                    }
                }
            }
        }
    }

    // Travessia "em-ordem"
    public void emOrdem(Elemento<T> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    // Travessia "pré-ordem"
    public void preOrdem(Elemento<T> atual) {
        if (atual != null) {
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    // Travessia "pós-ordem"
    public void posOrdem(Elemento<T> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    // Remover um elemento da árvore
    public boolean remover(T valor) {
        // Buscar o elemento na árvore
        Elemento<T> atual = this.raiz;
        Elemento<T> paiAtual = null;
        while(atual != null) {
            if (atual.getValor().equals(valor)) {
                break;
            } else if (valor.compareTo(atual.getValor()) == -1) { // Valor menor que o do elemento atual
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else {
                paiAtual = atual;
                atual = atual.getDireita();
            }
        }
        // Verifica se o elemento existe
        if (atual != null) {
            // Elemento tem dois filhos ou elemento tem filhos somente à direita
            if ((atual.getDireita() != null)) {

                Elemento<T> substituto = atual.getDireita();
                Elemento<T> paiSubstituto = atual;

                while(substituto.getEsquerda() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerda();
                }

                substituto.setEsquerda(atual.getEsquerda());

                if (paiAtual != null) {
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                } else { // Se não tem paiAtual, então é a raiz
                    this.raiz = substituto;
                }


                // Removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }

            }  else if (atual.getEsquerda() != null) { // Tem filhos só à esquerda
                Elemento<T> substituto = atual.getEsquerda();
                Elemento<T> paiSubstituto = atual;

                while(substituto.getDireita() != null) {
                    paiSubstituto = substituto;
                    substituto = substituto.getDireita();
                }

                if (paiAtual != null) {
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
                        paiAtual.setEsquerda(substituto);
                    } else {
                        paiAtual.setDireita(substituto);
                    }
                } else { // Se for a raiz
                    this.raiz = substituto;
                }



                // Removeu o elemento da árvore
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { // substituto < paiSubstituto
                    paiSubstituto.setEsquerda(null);
                } else {
                    paiSubstituto.setDireita(null);
                }

            } else { // Não tem filhos
                if (paiAtual != null) {
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
                        paiAtual.setEsquerda(null);
                    } else {
                        paiAtual.setDireita(null);
                    }
                } else { // É a raiz
                    this.raiz = null;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
