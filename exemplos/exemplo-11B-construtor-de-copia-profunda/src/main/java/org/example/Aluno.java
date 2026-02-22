package org.example;

public class Aluno {
    private String nome;
    private Double media;
    private Endereco endereco;

    public Aluno(String nome, Double media, Endereco endereco) {
        this.nome = nome;
        this.media = media;
        this.endereco = endereco;
    }

    // Construtor de cópia profunda
    public Aluno(Aluno aluno) {
        this.nome = aluno.getNome();
        this.media = aluno.getMedia();
        this.endereco = new Endereco(aluno.getEndereco().getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
