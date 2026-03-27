package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Tentando acessar o quarto elemento...");
            System.out.println(numbers[3]);
            System.out.println("Esta linha não será executada se uma exceção ocorrer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não deu certo! " + e.getMessage());
        } finally{
            System.out.println("Fim da tarefa!");
        }

    }
}