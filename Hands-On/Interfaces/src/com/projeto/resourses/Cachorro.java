package com.projeto.resourses;

import com.projeto.interfaces.Barulhento;

public class Cachorro implements Barulhento {

    @Override
    public String fazerBarulho() {
        return "au au";
    }
}
