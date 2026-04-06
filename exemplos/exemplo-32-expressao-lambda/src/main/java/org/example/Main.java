package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // (parâmetro) -> expressão
        // (parâmetro) -> {bloco de código}

        // Sem expressão lambda
        OperacaoMatematica soma = new OperacaoMatematica() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Soma sem expressão lambda: " + soma.calcular(20, 30));

        // Com expressão lambda
        OperacaoMatematica somaLambda = (a, b) -> a + b;

        System.out.println("Soma com função lambda: " + somaLambda.calcular(20, 30));

        OperacaoMatematica multiplicacao = (a, b) -> a * b;

        System.out.println("Multiplicação com função lambda: " + multiplicacao.calcular(20, 30));

        // Manipulação de caracteres sem expressão lambda
        ManipuladorString maiuscula = new ManipuladorString() {
            @Override
            public String manipular(String str) {
                return str.toUpperCase();
            }
        };

        System.out.println("Manipulação de caracteres sem expressão lambda: " + maiuscula.manipular("java"));

        // Manipulação de caracteres com expressão lambda
        ManipuladorString maiusculaLambda = (str) -> str.toUpperCase();

        System.out.println("Manipulação de caracteres com expressão lambda: " + maiusculaLambda.manipular("java"));

        // Uso de filtro sem expressão lambda
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> numerosPares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }

        System.out.println("Números pares sem expressão lambda: " + numerosPares);

        // Uso de filtro com expressão lambda
        List<Integer> numerosParesLambda = numeros.stream().filter(numero -> numero % 2 == 0).toList();

        System.out.println("Números pares com expressão lambda: " + numerosParesLambda);

        // Filtrar objeto
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Mariazinha", 15),
                new Pessoa("Joãozinho", 17),
                new Pessoa("Ritinha", 20)
        );

        List<String> nomes = pessoas.stream().map(pessoa -> pessoa.getNome()).toList();
        List<Integer> idades = pessoas.stream().map(Pessoa::getIdade).toList();

        System.out.println("Nomes: " + nomes);
        System.out.println("Idades: " + idades);
    }
}