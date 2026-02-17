package org.example;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void mostrarData() {
        System.out.println(String.format("%d/%d/%d", this.dia, this.mes, this.ano));
    }

    boolean fixarData(int dia, int mes, int ano) {
        boolean retorno = false;

        if (mes >= 1 && mes <= 12 && dia >= 1 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                retorno = dia <= 31;
            } else {
                if (mes == 2) {
                    if (ano % 4 == 0) {
                        retorno = dia <= 29;
                    } else  {
                        retorno = dia <= 28;
                    }
                } else {
                    retorno = dia <= 30;
                }
            }
        }

        if (retorno) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        return retorno;
    }
}
