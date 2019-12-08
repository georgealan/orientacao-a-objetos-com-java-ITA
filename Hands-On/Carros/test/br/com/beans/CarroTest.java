package br.com.beans;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarroTest {

    @Test
    public void carroParado() {
        Carro c = new Carro();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void acelerar() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void frear() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void frearAteZero() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }

}