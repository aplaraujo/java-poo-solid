package org.example;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No topo() {
        return this.refNoEntradaPilha;
    }

    public void empilhar(No valor) {
        No refAuxiliar = this.refNoEntradaPilha;
        this.refNoEntradaPilha = valor;
        this.refNoEntradaPilha.setProximo(refAuxiliar);
    }

    public No desempilhar() {
        if (!pilhaEstaVazia()) {
            No retirado = this.refNoEntradaPilha;
            this.refNoEntradaPilha = this.refNoEntradaPilha.getProximo();
            return retirado;
        }
        return null;
    }

    public boolean pilhaEstaVazia() {
        return this.refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaPilha;
        
        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[Nó: {dado= " + noAuxiliar.getConteudo() + "}]\n";
                noAuxiliar = noAuxiliar.getProximo();
            } else {
                break;
            }
        }
        return stringRetorno;
    }
}
