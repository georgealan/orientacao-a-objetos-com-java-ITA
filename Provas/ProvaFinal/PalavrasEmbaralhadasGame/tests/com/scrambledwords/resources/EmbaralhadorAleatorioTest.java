package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmbaralhadorAleatorioTest {
    Embaralhador embaralhador;

    @Before
    public void iniciaEmbaralhador(){
        embaralhador = new EmbaralhadorAleatorio();
    }

    @Test
    public void embaralharPalavraAbacaxi() {
        String expected = "abacaxi";
        assertFalse(expected.equals(embaralhador.embaralhar("abacaxi")));
    }
}