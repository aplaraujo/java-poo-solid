package org.example;

import java.util.Date;

public class LivroDeBiblioteca {
    private Livro livro;
    private Date dataEmprestimo;
    private String emprestadoPara;

    public LivroDeBiblioteca(Livro livro, Date dataEmprestimo, String emprestadoPara) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.emprestadoPara = emprestadoPara;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

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

    @Override
    public String toString() {
        return "LivroDeBiblioteca {" +
                "livro=" + livro +
                ", dataEmprestimo=" + dataEmprestimo +
                ", emprestadoPara='" + emprestadoPara + '\'' +
                '}';
    }
}
