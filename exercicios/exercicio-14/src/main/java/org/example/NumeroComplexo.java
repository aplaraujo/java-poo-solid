package org.example;

import java.util.Objects;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public NumeroComplexo somar(NumeroComplexo num) {
        double s1 = this.real + num.real;
        double s2 = this.imaginario + num.imaginario;
        return new NumeroComplexo(s1, s2);
    }

    public NumeroComplexo subtrair(NumeroComplexo num) {
        double s1 = this.real - num.real;
        double s2 = this.imaginario - num.imaginario;
        return new NumeroComplexo(s1, s2);
    }

    public NumeroComplexo multiplicar(NumeroComplexo num) {
        double m1 = (this.real * num.real) - (this.imaginario * num.imaginario);
        double m2 = (this.real * num.imaginario) + (this.imaginario * num.real);
        return new NumeroComplexo(m1, m2);
    }

    public NumeroComplexo dividir(NumeroComplexo num) {
        double denominador = (num.real * num.real) + (num.imaginario * num.imaginario);
        if (denominador == 0) throw new ArithmeticException("Não é permitida a divisão por zero!");
        double d1 = ((this.real * num.real) + (this.imaginario * num.imaginario)) / denominador;
        double d2 = ((this.imaginario * num.real) - (this.real * num.imaginario)) / denominador;
        return new NumeroComplexo(d1, d2);
    }

    public double modulo() {
        return Math.sqrt((this.real * this.real) + (this.imaginario * this.imaginario));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NumeroComplexo that = (NumeroComplexo) o;
        return Double.compare(real, that.real) == 0 && Double.compare(imaginario, that.imaginario) == 0;
    }

    @Override
    public String toString() {
        return "NumeroComplexo {" +
                "real=" + real +
                ", imaginario=" + imaginario +
                '}';
    }
}
