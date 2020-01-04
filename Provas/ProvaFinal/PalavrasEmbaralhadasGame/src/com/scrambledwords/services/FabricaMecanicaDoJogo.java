package com.scrambledwords.services;

import com.scrambledwords.interfaces.MecanicaDoJogo;
import com.scrambledwords.resources.MecanicaDoJogoTresErros;
import com.scrambledwords.resources.MecanicaDoJogoUmErro;
import com.scrambledwords.resources.MecanicaDoJogoZeraErrosCom5Acertos;
import com.scrambledwords.resources.MecanicaJogoLivre;


public class FabricaMecanicaDoJogo {
    private MecanicaDoJogo mecanica;

    public MecanicaDoJogo getMecanica(int opcao) {

        switch (opcao) {
            case 1:
                mecanica = new MecanicaJogoLivre();
                return mecanica;
            case 2:
                mecanica = new MecanicaDoJogoTresErros();
                return mecanica;
            case 3:
                mecanica = new MecanicaDoJogoUmErro();
                return mecanica;
            case 4:
                mecanica = new MecanicaDoJogoZeraErrosCom5Acertos();
                return mecanica;
            default:
                return null;
        }

    }

}
