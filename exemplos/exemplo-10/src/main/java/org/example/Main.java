package org.example;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("68911-095", "Avenida Santa Terezinha", 827, "Fazendinha", "Macapá", "AP");
        Cliente cliente1 = new Cliente("Clara Caroline Brito", "45.141.511-5", "056.524.108-76", endereco1);
        Conta conta1 = new Conta(cliente1, 111, 200.00);

        conta1.depositar(50.00);
        conta1.sacar(20.00);
        System.out.println(conta1);
    }
}