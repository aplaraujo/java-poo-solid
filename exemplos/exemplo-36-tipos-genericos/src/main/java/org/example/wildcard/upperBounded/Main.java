package org.example.wildcard.upperBounded;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
                new Aluno("Zequinha", 15, "Masculino"),
                new Aluno("Ritinha", 16, "Feminino")
        );

        imprimeLista(alunos);
    }

    public static void imprimeLista(List<? extends Pessoa> lista) {
        for(Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }
}
