package org.example;

public class Aluno {
    private String nome;
    private Double media;

    public Aluno(String nome, Double media) {
        this.nome = nome;
        this.media = media;
    }

    // Construtor de cópia superficial (shallow clone)
    public Aluno(Aluno aluno) {
        this.nome = aluno.getNome();
        this.media = aluno.getMedia();
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
}
