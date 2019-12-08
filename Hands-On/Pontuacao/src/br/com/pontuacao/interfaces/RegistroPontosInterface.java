package br.com.pontuacao.interfaces;

import br.com.pontuacao.beans.Usuario;

public interface RegistroPontosInterface {
    public void fazerUmComentario(Usuario u);
    public void criarUmTopico(Usuario u);
    public void darUmLike(Usuario u);

}
