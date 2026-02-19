package org.example;

public enum FaixaDeRisco {
    ABAIXO_DO_PESO("Abaixo do peso ideal"),
    PESO_NORMAL("Peso normal"),
    EXCESSO_DE_PESO("Excesso de peso"),
    OBESIDADE("Obesidade"),
    OBESIDADE_MORBIDA("Obesidade mórbida");

    private final String descricao;

    FaixaDeRisco(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
