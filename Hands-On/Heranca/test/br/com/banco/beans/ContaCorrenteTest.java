package br.com.banco.beans;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContaCorrenteTest {

    ContaCorrente cc;

    @Before
    public void inicializaConta(){
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void saque() {
        int valorSacado = cc.sacar(50);
        assertEquals(150, cc.saldo);
        assertEquals(valorSacado,50);
    }

    @Test
    public void deposito() {
        assertEquals(200, cc.saldo);
    }

    @Test
    public void saqueMaiorQueSaldo(){
        int valorSacado = cc.sacar(250);
        assertEquals(200, cc.saldo);
        assertEquals(0, valorSacado);
    }

}