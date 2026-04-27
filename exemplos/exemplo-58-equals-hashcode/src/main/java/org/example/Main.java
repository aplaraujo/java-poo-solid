package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        String resposta, nome;
        int idade;

        resposta = "s";

        while (resposta.equals("s") || resposta.equals("S")) {

            System.out.print("Digite um nome: ");
            nome = sc.nextLine();
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, idade);

            if (pessoas.contains(pessoa)) {
                System.err.println("Essa pessoa já foi adicionada. Inclua outro nome");
            } else {
                pessoas.add(pessoa);
                System.out.println("Pessoa adicionada");
            }

            System.out.print("Deseja continuar? ");
            resposta = sc.next();
            sc.nextLine();
        }

        pessoas.forEach(System.out::println);

        sc.close();
    }
}