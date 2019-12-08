package br.com.pontuacao.services;

import br.com.pontuacao.beans.Usuario;
import br.com.pontuacao.interfaces.RegistroPontosInterface;

public class RegistroPontos implements RegistroPontosInterface {

    private CalculadoraBonus bonus;

    public RegistroPontos(CalculadoraBonus cb){
        bonus = cb;
    }

    @Override
    public void fazerUmComentario(Usuario u) {
        u.pontos += 3 * bonus.bonus(u);
    }

    @Override
    public void criarUmTopico(Usuario u) {
        u.pontos += 5 * bonus.bonus(u);
    }

    @Override
    public void darUmLike(Usuario u) {
        u.pontos += 1 * bonus.bonus(u);
    }
}
