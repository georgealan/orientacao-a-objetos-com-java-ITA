package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;

import java.util.ArrayList;

public class EmbaralhadorImparPar implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        ArrayList<Character> pares = new ArrayList<>();
        ArrayList<Character> impares = new ArrayList<>();
        for (int i = 0; i < palavra.length(); i++) {
            if ((i % 2) == 0) {
                pares.add(palavra.charAt(i));
            } else {
                impares.add(palavra.charAt(i));
            }
        }

        String palavraembaralhada = pares.toString() + impares.toString();
        palavraembaralhada = palavraembaralhada.replace("[", "");
        palavraembaralhada = palavraembaralhada.replace("]", "");
        palavraembaralhada = palavraembaralhada.replace(",", "");
        palavraembaralhada = palavraembaralhada.replace(" ", "");

        return palavraembaralhada;
    }
}
