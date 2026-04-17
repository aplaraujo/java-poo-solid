package org.example;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        refNoEntradaFila = null;
    }

     public void enfileirar(T valor) {
        No novoElemento = new No(valor);
        novoElemento.setProximo(refNoEntradaFila);
        refNoEntradaFila = novoElemento;
     }

     public T primeiroDaFila() {
        if (!filaEstaVazia()) {
            No primeiroElemento = refNoEntradaFila;
            while (true) {
                if (primeiroElemento.getProximo() != null) {
                    primeiroElemento = primeiroElemento.getProximo();
                } else {
                    break;
                }
            }
            return (T) primeiroElemento.getConteudo();
        }
        return null;
     }

    public T desenfileirar() {
        if (!filaEstaVazia()) {
            No primeiroElemento = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroElemento.getProximo() != null) {
                    noAuxiliar = primeiroElemento;
                    primeiroElemento = primeiroElemento.getProximo();
                } else {
                    noAuxiliar.setProximo(null);
                    break;
                }
            }
            return (T) primeiroElemento.getConteudo();
        }
        return null;
    }

    public boolean filaEstaVazia() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[Nó: {dado = " + noAuxiliar.getConteudo() + "}]---->";

                if (noAuxiliar.getProximo() != null) {
                    noAuxiliar = noAuxiliar.getProximo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
