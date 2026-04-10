package org.example.wildcard.unbounded;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
                new Aluno("Zequinha", 15),
                new Aluno("Ritinha", 17)
        );

        imprimeLista(alunos);
    }

    public static void imprimeLista(List<?> lista){
        for(Object aluno : lista){
            System.out.println(aluno);
        }
    }
}
