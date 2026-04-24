package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    // Método para encontrar a frequência de cada string dentro de um vetor
    public static Map<String, Long> frequency(String[] stringArr) {
        return Arrays.stream(stringArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("[" + i + "]: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("=========================");
        System.out.println("==== Vetor de nomes =====");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print(nomes[i] + " ");
        }

        Map<String, Long> frequency = frequency(nomes);


        System.out.println(frequency);

        sc.close();
    }
}