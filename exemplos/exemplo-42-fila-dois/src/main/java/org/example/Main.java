package org.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> minhaFila = new ArrayDeque<Integer>();

        Queue<Aluno> filaDeAlunos = new ArrayDeque<Aluno>();

        minhaFila.add(1);
        minhaFila.add(2);
        minhaFila.add(3);
        minhaFila.add(4);
        minhaFila.add(5);

        filaDeAlunos.add(new Aluno("Zequinha"));
        filaDeAlunos.add(new Aluno("Ritinha"));

        minhaFila.poll();
        System.out.println(minhaFila);

        System.out.println("Primeiro elemento da fila: " + minhaFila.peek());

        System.out.println("A fila está vazia? " + minhaFila.isEmpty());

        System.out.println(filaDeAlunos);

    }
}