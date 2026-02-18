package org.example.domain;

public class CriarLivroService {
    private final LivroRepository repository;

    public CriarLivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public void executar(String titulo, String autor, int numPaginas, int anoLancamento, String isbn) {
        Livro livro = new Livro(titulo, autor, numPaginas, anoLancamento, isbn);
        repository.salvar(livro);
    }
}
