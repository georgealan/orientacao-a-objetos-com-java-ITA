package br.com.beans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarroSomaTest {

    CarroDeCorrida c;

    @Before
    public void inicializaCarro(){
        c = new CarroSoma("Ferrari", 10, 100);
    }

    @Test
    public void carroParado() {
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void acelerar() {
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void frear() {
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void frearAteZero() {
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void acelerarAteVelocidadeMaxima() {
        for (int i = 0; i< 14; i++)
            c.acelerar();
        assertEquals(100, c.getVelocidade());
    }

}