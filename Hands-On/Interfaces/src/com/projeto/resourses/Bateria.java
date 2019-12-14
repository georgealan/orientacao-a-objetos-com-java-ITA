package com.projeto.resourses;

import com.projeto.interfaces.Barulhento;

public class Bateria implements Barulhento {

    @Override
    public String fazerBarulho() {
        return "pum pum tá tá ptiz";
    }
}
