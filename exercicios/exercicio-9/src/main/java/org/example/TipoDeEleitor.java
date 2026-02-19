package org.example;

public enum TipoDeEleitor {
    NAO_ELEITOR("Não eleitor"),
    ELEITOR_FACULTATIVO("Eleitor facultativo"),
    ELEITOR_OBRIGATORIO("Eleitor obrigatório");

    private final String descricao;

    TipoDeEleitor(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
