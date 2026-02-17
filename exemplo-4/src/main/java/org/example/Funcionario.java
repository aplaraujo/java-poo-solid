package org.example;

public class Funcionario {
    private String departmento;
    private double salario;
    private boolean ativo;
    private String dataEntrada;
    private String rg;
    private String nome;

    public String getDepartmento() {
        return departmento;
    }

    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void bonificar(double aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    public void demitir() {
        this.setAtivo(false);
    }

    public void mostrar() {
        StringBuilder str = new StringBuilder();
        str.append(this.getNome() + "\n");
        str.append(this.getDepartmento() + "\n");
        str.append(this.isAtivo() + "\n");
        str.append(this.getSalario() + "\n");
        str.append(this.getDataEntrada() + "\n");
        str.append(this.getRg());
        System.out.println(str.toString());
    }
}
