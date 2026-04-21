package org.example;

import java.util.Scanner;

public class Main {
    static int capacidade = 10;
    static long[] tabelaHash = new long[capacidade];

    public static int hash(long key, int index) {
        return (int) ((key + index) % capacidade); // Tratamento de colisão
    }

    public static void mostrarTabela() {
        System.out.println("======================");
        System.out.println("===== Tabela Hash: ===");
        System.out.println("======================");
        System.out.println();
        for (int i = 0; i < capacidade; i++) {
            if (tabelaHash[i] != 0) System.out.println("Posição: " + i +  ": " + tabelaHash[i]);
            else System.out.println("Posição: " + i + ": vazia");
        }
        System.out.println("======================");
        System.out.println();
    }

    public static void main(String[] args) {
        while (true) {
            int deslocamento = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um CPF: ");
            long cpf = sc.nextLong();
            int posicao = hash(cpf, deslocamento);

            while (tabelaHash[posicao] != 0) {
                deslocamento++;
                posicao = hash(cpf, deslocamento);
            }
            tabelaHash[posicao] = cpf;
            System.out.println("CPF " + cpf + " adicionado na posição " + posicao);
            mostrarTabela();
        }
    }
}