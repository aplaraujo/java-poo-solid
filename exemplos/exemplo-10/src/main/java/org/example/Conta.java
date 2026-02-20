package org.example;

public class Conta {
    private Cliente cliente;
    private Integer numeroConta;
    private Double saldo;

    public Conta(Cliente cliente, Integer numeroConta, Double saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta {" +
                "cliente=" + cliente +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
