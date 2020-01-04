package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmbaralhadorImparParTest {
    Embaralhador embaralhador;

    @Before
    public void iniciaEmbaralhador(){
        embaralhador = new EmbaralhadorImparPar();
    }

    @Test
    public void embaralharPalavraTeste() {
        assertEquals("tseet", embaralhador.embaralhar("teste"));
    }

    @Test
    public void embaralharPalavraQualifica() {
        assertEquals("qaiiaulfc", embaralhador.embaralhar("qualifica"));
    }
}