package com.projeto.resourses;

import com.projeto.interfaces.Barulhento;

public class Carro implements Barulhento {

    @Override
    public String fazerBarulho() {
        return "Vrum Vrum bi bi";
    }
}
