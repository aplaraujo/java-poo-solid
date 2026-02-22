package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zequinha", 8.5);
        Aluno aluno2 = new Aluno(aluno1);

        aluno1.setNome("Mariazinha");

        System.out.println("Original: " + aluno1.getNome());
        System.out.println("Cópia: " + aluno2.getNome());
    }
}