package org.example;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double calcularIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", genero='" + genero + '\'' +
                '}';
    }
}
