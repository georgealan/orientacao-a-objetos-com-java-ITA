package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;

import java.util.ArrayList;
import java.util.List;

public class EmbaralhadorAleatorio implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        List<Character> characters = new ArrayList<>();

        for (char c : palavra.toCharArray())
            characters.add(c);

        StringBuilder palavraEmbaralhada = new StringBuilder(palavra.length());

        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            palavraEmbaralhada.append(characters.remove(randPicker));
        }
        return palavraEmbaralhada.toString();
    }
}
