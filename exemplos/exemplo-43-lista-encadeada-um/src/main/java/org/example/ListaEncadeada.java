package org.example;

public class ListaEncadeada {
    private No primeiro; // Primeiro nó da lista
    private No ultimo; // Ultímo nó da lista
    private int tamanho; // Número total de elementos na lista

    // Verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Inserir um nó no começo da lista
    public void inserirNoInicio(int valor) {
        No no = new No(valor); // Criar uma instância da classe No;
        // Se a lista está vazia, o nó criado será o primeiro e o último elemento
        // Caso contrário, o novo nó é ligado ao primeiro nó e "primeiro" é atualizado
        if (estaVazia()) {
            primeiro = no;
            ultimo = no;
        } else {
            no.setProximo(primeiro);
            primeiro = no;
        }
        tamanho++;
    }

    // Remover um nó do começo do lista
    public void removerPrimeiro() {
        if (!estaVazia()) {
            primeiro = primeiro.getProximo();
            tamanho--;

            if (estaVazia()) ultimo = null;
        }
    }

    // Remover um nó no final da lista
    public void removerNoFim() {
        if (!estaVazia()) {
            if (primeiro == ultimo) {
                removerPrimeiro(); // Retutiliza a lógica da remoção do primeiro nó
            } else {
                No atual = primeiro;
                while (atual.getProximo() != ultimo) {
                    atual = atual.getProximo();
                }
                ultimo = atual; // Atualizamos ultimo para que ele passe a ser atual
                ultimo.setProximo(null); // Definimos ultimo.proximo = null para remover a referência ao último nó anterior.
                tamanho--; // Reduzimos tamanho-- para manter a contagem correta de elementos.
            }
        }
    }

    // Buscar um elemento na lista
    public No buscarElemento(int valor) {
        No atual = primeiro;
        while (atual != null) {
            if (atual.getValor() == valor) {
                return atual; // Retornar o nó encontrado
            }
            atual = atual.getProximo(); // Atualiza para o próximo nó
        }
        return null; // Retorna null se o valor não for encontrado
    }

    // Remover um elemento específico
    public void remover(int valor) {
        if (estaVazia()) return; // Lista vazia, nada a remover

        // Remover o primeiro nó
        if (primeiro.getValor() == valor) {
            removerPrimeiro();
            return;
        }

        No atual = primeiro;
        No anterior = null;

        // Percorrer a lista para encontrar o nó a ser removido
        while ((atual != null) && atual.getValor() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        // Se o valor não foi encontrado, encerra
        if (atual == null) return;

        // Caso especial: remover o último nó
        if (atual == ultimo) {
            removerNoFim();
        } else {
            anterior.setProximo(atual.getProximo());
            tamanho--;
        }
    }

    @Override
    public String toString() {
        return "ListaEncadeada {" +
                "primeiro=" + primeiro +
                ", ultimo=" + ultimo +
                ", tamanho=" + tamanho +
                '}';
    }
}
