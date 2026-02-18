package org.example.infrastructure;

import org.example.domain.Livro;
import org.example.domain.LivroRepository;

import java.util.ArrayList;
import java.util.List;

public class LivroRepositoryEmMemoria implements LivroRepository {

    private List<Livro> lista = new ArrayList<>();

    @Override
    public void salvar(Livro livro) {
        lista.add(livro);
        System.out.println("Livro salvo na memória!");
    }
}
