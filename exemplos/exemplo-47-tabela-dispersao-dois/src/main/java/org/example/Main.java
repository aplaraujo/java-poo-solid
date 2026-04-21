package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(7);
        Scanner sc = new Scanner(System.in);
        int item;

        for (int i = 0; i < 7; i++) {
            System.out.print("Elemento " + i + ": ");
            item = sc.nextInt();
            tabelaHash.inserir(item);
        }

        System.out.println("\n Imprimindo conteúdo:");
        tabelaHash.imprimir();

        while (true) {
            System.out.println("\n\n>> Forneça o item que deseja apagar (-1 sai): ");
            item = sc.nextInt();
            if (item == -1) break;

            tabelaHash.apagar(item);
            tabelaHash.imprimir();
        }

        System.out.println("\n");

        sc.close();
    }
}