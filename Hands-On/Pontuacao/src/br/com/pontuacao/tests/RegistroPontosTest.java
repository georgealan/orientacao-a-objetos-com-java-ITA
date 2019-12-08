import br.com.pontuacao.beans.Usuario;
import br.com.pontuacao.services.CalculadoraBonus;
import br.com.pontuacao.services.RegistroPontos;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistroPontosTest {

    @Test
    public void pontosCriarTopico() {
        Usuario u = new Usuario();
        u.nome = "George";
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 5);
    }

    @Test
    public void pontosCriarTopicoVip() {
        Usuario u = new Usuario();
        u.nome = "George";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 25);
    }

    @Test
    public void pontosCriarTopicoBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "George";
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 15);
    }

    @Test
    public void pontosCriarTopicoVipBonusDoDia() {
        Usuario u = new Usuario();
        u.nome = "George";
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus();
        cb.bonusDoDia = 2;
        RegistroPontos rp = new RegistroPontos(cb);
        rp.criarUmTopico(u);
        assertEquals(u.pontos, 50);
    }
}