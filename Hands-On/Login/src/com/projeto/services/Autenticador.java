package com.projeto.services;

import com.projeto.excecoes.LoginException;
import com.projeto.resourses.Usuario;

public class Autenticador {
    public Usuario logar(String login, String senha) throws LoginException {
        if (login.equals("george") && senha.equals("1234")){
            return new Usuario(login);
        }
        throw new LoginException("O usuario e a senha não batem!", login);
    }

}
