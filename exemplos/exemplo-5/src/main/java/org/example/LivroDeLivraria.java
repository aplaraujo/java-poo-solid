package org.example;

public class LivroDeLivraria {
    private Livro livro;
    private double preco;

    public LivroDeLivraria(Livro livro, double preco) {
        this.livro = livro;
        this.preco = preco;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LivroDeLivraria {" +
                "livro=" + livro +
                ", preco=" + preco +
                '}';
    }
}
