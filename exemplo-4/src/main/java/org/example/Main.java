package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Zequinha");
        funcionario.setAtivo(true);
        funcionario.setDataEntrada("10/02/2020");
        funcionario.setDepartmento("RH");
        funcionario.setRg("328660590");
        funcionario.setSalario(1500.00);
        funcionario.bonificar(100.00);
        funcionario.demitir();
        funcionario.mostrar();
    }
}