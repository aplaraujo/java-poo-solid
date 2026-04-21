package org.example;

public class TabelaHash {
    private Lista[] tabela;
    private final int TAMANHO_MAXIMO;

    public TabelaHash(int tamanho) {
        tabela = new Lista[tamanho];
        TAMANHO_MAXIMO = tamanho;

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = null;
        }
    }

    private int funcaoHash(int chave) {
        int valor = chave;
        return (Math.abs(valor) % TAMANHO_MAXIMO);
    }

    public void inserir(int item) {
        int pos = funcaoHash(item);
        if (tabela[pos] != null) {
            if (tabela[pos].buscarLista(item)) {
                System.out.println("O item " + item + " já foi cadastrado!");
                return;
            }
        } else {
            tabela[pos] = new Lista();
        }
        tabela[pos].inserir(item);
    }

    public void apagar(int chave) {
        int pos = buscar(chave);
        if (pos != -1) {
            tabela[pos].apagarLista(chave);
        }
        else {
            System.out.println("\n Item não encontrado!");
        }
    }

    public void imprimir() {
        for (int i = 0; i < TAMANHO_MAXIMO; i++) {
            System.out.println("\n HASH[" + i + "] -> ");
            if (tabela[i] != null) {
                tabela[i].imprimirLista();
            }
            System.out.println("null");
        }
    }

    public int buscar(int chave) {
        for (int i = 0; i < TAMANHO_MAXIMO; i++) {
            if (tabela[i] != null) {
                if (tabela[i].buscarLista(chave)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
