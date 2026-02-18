package org.example;

import org.example.domain.CriarLivroService;
import org.example.domain.LivroRepository;
import org.example.infrastructure.LivroRepositoryEmMemoria;

public class Main {
    public static void main(String[] args) {
        LivroRepository repository = new LivroRepositoryEmMemoria();
        CriarLivroService service = new CriarLivroService(repository);

        service.executar("Meninas Malvadas e Mimadas", "Bruna Aragão", 250, 2000, "0-1800-1780-2");
    }
}