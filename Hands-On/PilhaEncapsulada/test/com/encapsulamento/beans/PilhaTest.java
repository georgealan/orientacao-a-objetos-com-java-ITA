package com.encapsulamento.beans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    Pilha p;

    @Before
    public void criaObjeto(){
        p = new Pilha(10);
        p.empilhar("Eduardo");
        p.empilhar("Maria");
        p.empilhar("Jose");
    }

    @Test
    public void objetoNoTopoDaPilha(){
        assertEquals("Jose", p.topo());
    }

    @Test
    public void quantidadeDeObjetosNaPilha(){
        assertEquals(3, p.tamanhoDaPilha());
    }

    @Test
    public void objetoNoTopoAposDesempilhar(){
        p.desempilhar();
        assertEquals("Maria", p.topo());
    }

    @Test
    public void quantidadeAposDesempilhar(){
        p.desempilhar();
        assertEquals(2, p.tamanhoDaPilha());
    }

}