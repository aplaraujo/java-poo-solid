package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Zequinha", 8.5, new Endereco("01310-900"));
        Aluno aluno2 = new Aluno(aluno1);

        aluno1.getEndereco().setCep("02994-070");

        System.out.println("Original: " + aluno1.getEndereco().getCep());
        System.out.println("Cópia: " + aluno2.getEndereco().getCep());
    }
}