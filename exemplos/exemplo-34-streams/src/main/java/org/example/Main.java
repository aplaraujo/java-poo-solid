package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Filtrar números pares
        List<Integer> pares = numList.stream().filter(num -> num % 2 == 0).toList();

        // for
        List<Integer> pares2 = new ArrayList<>();
        for(Integer num : pares) {
            if (num % 2 == 0) {
                pares2.add(num);
            }
        }

        // Filtrar números ímpares
        List<Integer> impares = numList.stream().filter(num -> num % 2 != 0).toList();

        // Somar todos os números do vetor
        int soma = numList.stream().reduce(0, (atual, valor) -> atual + valor);

        // Soma com for
        int soma2 = 0;
        for(Integer num : numList) {
            soma2 += num;
        }

        // Mapear os elementos
        List<Integer> tabuadaDois = numList.stream().map(num -> num * 2).toList();

        List<Pessoa> pessoas = Arrays.asList(
          new Pessoa("Mariazinha", 15),
          new Pessoa("Joãozinho", 13), new Pessoa("Ritinha", 20),
            new Pessoa("Aninha", 25),
            new Pessoa("Zequinha", 18)
        );

        List<String> maiores18Anos = pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).map(Pessoa::getNome).toList();
        List<String> menores18Anos = pessoas.stream().filter(pessoa -> pessoa.getIdade() < 18).map(Pessoa::getNome).toList();
        int somaIdades = pessoas.stream().map(pessoa -> pessoa.getIdade()).reduce(0, (atual, valor) -> atual + valor);

        System.out.println("Lista de números pares: " + pares);
        System.out.println("Nova lista de números pares: " + pares2);
        System.out.println("Lista de números ímpares: " + impares);
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da soma com foreach: " + soma2);
        System.out.println("Tabuada do dois: " + tabuadaDois);
        System.out.println("Pessoas com idade igual ou maior que 18 anos: " + maiores18Anos);
        System.out.println("Pessoas com menos de 18 anos: " + menores18Anos);
        System.out.println("Soma das idades: " + somaIdades);
    }
}