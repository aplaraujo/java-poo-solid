package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Pessoa> listaDePessoas = new LinkedList<Pessoa>();

        listaDePessoas.add(new Pessoa("Mariazinha", 15));
        listaDePessoas.add(new Pessoa("Zequinha", 16));
        listaDePessoas.add(new Pessoa("Ritinha", 17));
        listaDePessoas.add(new Pessoa("Joãozinho", 13));
        listaDePessoas.add(new Pessoa("Aninha", 17));


        listaDePessoas.add(3, new Pessoa("Clarinha", 14));

        listaDePessoas.remove(2);

        listaDePessoas.remove();

        System.out.println("Lista de pessoas: " + listaDePessoas);

        System.out.println("============================");
        System.out.println("=== Percorrendo a lista: ===");

        for (Pessoa pessoa : listaDePessoas) {
            System.out.print(pessoa + " ");
        }
    }
}