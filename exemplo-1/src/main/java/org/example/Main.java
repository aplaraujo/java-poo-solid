package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Curso curso = new Curso();

        cliente.setNome("Zezinho");
        cliente.setIdade(22);
        cliente.setRenda(2000.00);
        System.out.println(cliente);

        curso.setNome("Análise de Sistemas");
        curso.setDuracao(4);
        curso.setValor(900.00);
        System.out.println(curso);


    }
}