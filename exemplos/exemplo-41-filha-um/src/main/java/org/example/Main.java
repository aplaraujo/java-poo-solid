package org.example;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(4);
        fila.enqueue(5);

        fila.imprimirFila();

        System.out.println("Primeiro elemento da fila: " + fila.front());
    }
}