package org.example;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    // Método que retorna o tamanho da lista
    public int size() {
        return this.tamanhoLista;
    }

    // Método privado para ser usado em outras operações da lista
    private NoDuplo<T> getNo(int index) {
        // Percorrer os nós da lista
        // O primeiro valor do nó auxiliar será o primeiro nó da lista
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximo();
        }

        return noAuxiliar;
    }

    // Método que retorna o elemento genérico da lista no índice n
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    // Método para incluir um nó na lista
    public void add(T elemento) {
        // Criar uma instância da classe NoDuplo
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        // inclusão do nó ao final da lista
        novoNo.setProximo(null);
        novoNo.setAnterior(this.ultimoNo);

        if (primeiroNo == null) primeiroNo = novoNo;
        if (ultimoNo != null) ultimoNo.setProximo(novoNo);

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = this.getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximo(noAuxiliar);

        if (novoNo.getProximo() != null) {
            novoNo.setAnterior(noAuxiliar.getAnterior());
            novoNo.getProximo().setAnterior(novoNo);
        } else {
            novoNo.setAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) primeiroNo = novoNo;
        else novoNo.getAnterior().setProximo(novoNo);

        tamanhoLista++;
    }

    // Método para remover um nó da lista
    public void remove(int index) {

        if (index == 0) {
            primeiroNo = primeiroNo.getProximo();
            if (primeiroNo != null) {
                primeiroNo.setAnterior(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = this.getNo(index);
            noAuxiliar.getAnterior().setProximo(noAuxiliar.getProximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getProximo().setAnterior(noAuxiliar.getAnterior() );
            } else {
                this.ultimoNo = noAuxiliar;
            }
        }

        // Reduzir o tamanho da lista
        tamanhoLista--;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "Nó duplo: [" + "conteudo = " + noAuxiliar.getConteudo() + "] ->";
            noAuxiliar = noAuxiliar.getProximo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
