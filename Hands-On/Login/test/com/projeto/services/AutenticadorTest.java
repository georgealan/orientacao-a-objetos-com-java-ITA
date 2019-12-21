package com.projeto.services;

import com.projeto.excecoes.LoginException;
import com.projeto.resourses.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutenticadorTest {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("george", "1234");
        assertEquals("george", u.getLogin());
    }

    @Test(expected = LoginException.class)
    public void loginFalho() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("george", "senha-errada");
    }

    @Test
    public void informacaoDoErro(){
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("george", "senha-errada");
            fail();
        } catch (LoginException e) {
            assertEquals("george", e.getLogin());
        }
    }


}