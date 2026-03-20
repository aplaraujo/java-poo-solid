package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void testGetNome() {
        Pessoa pessoa = new Pessoa("Java", 25);
        assertEquals("Java", pessoa.nome());
    }

    @Test
    void testGetIdade() {
        Pessoa pessoa = new Pessoa("Java", 25);
        assertEquals(25, pessoa.idade());
    }

    @Test
    void testEqualsObject() {
        Pessoa pessoa1 = new Pessoa("Java", 25);
        Pessoa pessoa2 = new Pessoa("Java", 25);
        assertEquals(pessoa1, pessoa2);
    }

    @Test
    void testHashCode() {
        Pessoa pessoa1 = new Pessoa("Java", 25);
        Pessoa pessoa2 = new Pessoa("Java", 25);
        assertEquals(pessoa1.hashCode(), pessoa2.hashCode());
    }

    @Test
    void testToString() {
        Pessoa pessoa = new Pessoa("Java", 25);
        assertEquals("Pessoa[nome=Java, idade=25]", pessoa.toString());
    }

}