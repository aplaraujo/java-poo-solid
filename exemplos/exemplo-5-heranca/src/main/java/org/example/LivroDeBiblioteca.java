package org.example;

import java.util.Date;

public class LivroDeBiblioteca extends Livro {
    private Date dataEmprestimo;
    private String emprestadoPara;

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(String emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }
}
