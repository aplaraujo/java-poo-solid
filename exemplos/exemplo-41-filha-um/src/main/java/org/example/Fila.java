package org.example;

public class Fila {
    private int[] elementos; // Onde serão colocados os elementos da fila
    private int capacidade; // Quantidade máxima de elementos da fila
    private int inicio; //  índice do primeiro elemento na fila
    private int fim; //  índice do último elemento na fila
    private int tamanho; // número de elementos na fila

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    // Verifica se a fila está vazia (tamanho igual a 0)
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Verifica se a fila está cheia (tamanho igual à quantidade máxima de elementos na fila)
    public boolean isFull() {
        return tamanho == capacidade;
    }

    // Incluir um elemento no fim da fila
    public void enqueue(int elemento) {
        if (isFull()) throw new IllegalStateException("A fila está cheia");

        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanho++;
    }

    // Retirar um elemento da fila
    public void dequeue() {
        if (isEmpty()) throw new IllegalStateException("A fila está vazia");

        int elementoRemovido = elementos[inicio];
        elementos[inicio] = 0;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
    }

    // Retorna o elemento no início da fila sem removê-lo
    public int front() {
        if (isEmpty()) throw new IllegalStateException("A fila está vazia");

        return elementos[inicio];
    }

    public void imprimirFila() {
        for(int i = 0; i < capacidade; i++) {
            System.out.println(elementos[i]);
        }
    }
}
