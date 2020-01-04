package com.scrambledwords.services;

import com.scrambledwords.interfaces.Embaralhador;
import com.scrambledwords.resources.EmbaralhadorAleatorio;
import com.scrambledwords.resources.EmbaralhadorImparPar;

import java.util.Random;

public class FabricaEmbaralhadores {
    private Embaralhador embaralhador;

    public Embaralhador getEmbaralhador() {
        Random r = new Random();
        switch (r.nextInt(2)) {
            case 0:
                embaralhador = new EmbaralhadorImparPar();
                return embaralhador;
            case 1:
                embaralhador = new EmbaralhadorAleatorio();
                return embaralhador;
            default:
                return null;
        }
    }
}
