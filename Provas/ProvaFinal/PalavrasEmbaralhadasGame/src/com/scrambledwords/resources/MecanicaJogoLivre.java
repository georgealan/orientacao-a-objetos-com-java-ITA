package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;
import com.scrambledwords.interfaces.MecanicaDoJogo;
import com.scrambledwords.services.BancoDePalavras;
import com.scrambledwords.services.FabricaEmbaralhadores;


public class MecanicaJogoLivre implements MecanicaDoJogo{
    private int pontuacao;
    private int numeroDePalavras;
    private BancoDePalavras bancoDePalavras = new BancoDePalavras();
    private Embaralhador embaralhador = new FabricaEmbaralhadores().getEmbaralhador();
    private String palavra;

    public MecanicaJogoLivre() {
        super();
        this.pontuacao = 0;
        this.numeroDePalavras = 0;
    }

    public String mostrarPalavra() {
        palavra = bancoDePalavras.getPalavra();
        return "Tente acertar qual é a palavra: " + embaralhador.embaralhar(palavra);
    }

    @Override
    public String verificarPalavraDigitada(String palavraDoJogador) {
        if (palavra.equals(palavraDoJogador)) {
            adicionaPontuacao(palavra.length());
            numeroDePalavras++;
            return "Acertou, a palavra é: " + palavra;
        } else {
            numeroDePalavras++;
            return "Errou, a palavra é: " + palavra;
        }
    }

    @Override
    public Boolean fimDoJogo() {
        if (numeroDePalavras < 20) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void adicionaPontuacao(int numeroDeLetras) {
        pontuacao = pontuacao + numeroDeLetras * 2;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
