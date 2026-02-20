package org.example;

public class Funcionario {
    private String nome;
    private double salarioMes;
    private int quantFilhos;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioMes, int quantFilhos) {
        this.nome = nome;
        this.salarioMes = salarioMes;
        this.quantFilhos = quantFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public int getQuantFilhos() {
        return quantFilhos;
    }

    public void setQuantFilhos(int quantFilhos) {
        this.quantFilhos = quantFilhos;
    }

    public double calcularAumento(double percAumento) {
        return this.salarioMes += (this.salarioMes * (percAumento / 100));
    }

    public double calcularINSS() {
        if (this.salarioMes <= 2545.00) return this.salarioMes * ((double)6 / 100);
        return this.salarioMes * ((double)10 / 100);
    }

    public double calcularIR() {
        if (this.salarioMes >= 1903.99 && this.salarioMes <= 2826.65) return Math.round((this.salarioMes * 0.075) * 10.0) / 10.0;
        if (this.salarioMes >= 2826.66 && this.salarioMes <= 3751.05) return Math.round((this.salarioMes * 0.15) * 10.0) / 10.0;
        if (this.salarioMes >= 3751.06 && this.salarioMes <= 4664.68) return Math.round((this.salarioMes * 0.225) * 10.0) / 10.0;
        return Math.round((this.salarioMes * 0.275) * 10.0) / 10.0;
    }

    public double calcularIRPF() {
        return Math.round((this.calcularIR() - (545.00 * this.quantFilhos)) * 10.0) / 10.0;
    }
}
