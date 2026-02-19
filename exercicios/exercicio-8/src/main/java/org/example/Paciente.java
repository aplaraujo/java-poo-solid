package org.example;

public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

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

    public double calcularIMC() {
        double imc = this.peso / Math.pow(this.altura, 2);
        return Math.round(imc * 10.0) / 10.0;
    }

    public FaixaDeRisco getFaixaDeRisco() {
        double imc = calcularIMC();
        if (imc < 20.0) return FaixaDeRisco.ABAIXO_DO_PESO;
        if (imc < 25.0) return FaixaDeRisco.PESO_NORMAL;
        if (imc < 30.0) return FaixaDeRisco.EXCESSO_DE_PESO;
        if (imc < 35.0) return FaixaDeRisco.OBESIDADE;
        return FaixaDeRisco.OBESIDADE_MORBIDA;
    }
}
