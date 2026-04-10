package org.example.wildcard.lowerBounded;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> alunos = new ArrayList<Pessoa>();
        alunos.add(new Aluno("Zequinha", 15, "Masculino"));
        alunos.add(new Aluno("Ritinha", 16, "Feminino"));

        imprimeLista(alunos);
    }

    public static void imprimeLista(List<? super Pessoa> lista){
        for(Object pessoa : lista) {
            System.out.println(pessoa);
        }
    }
}
