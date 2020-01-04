package com.scrambledwords.resources;

import com.scrambledwords.interfaces.Embaralhador;
import com.scrambledwords.interfaces.MecanicaDoJogo;
import com.scrambledwords.services.BancoDePalavras;
import com.scrambledwords.services.FabricaEmbaralhadores;

public class MecanicaDoJogoZeraErrosCom5Acertos implements MecanicaDoJogo {
    private int pontuacao;
    private int numeroDeErros;
    private int numeroDePalavras;
    private int numeroDeAcertos;
    private int quantidadeDeVidas;
    BancoDePalavras bancoDePalavras = new BancoDePalavras();
    Embaralhador embaralhador = new FabricaEmbaralhadores().getEmbaralhador();
    private String palavra;

    public MecanicaDoJogoZeraErrosCom5Acertos() {
        super();
        this.pontuacao = 0;
        this.numeroDeErros = 0;
        this.numeroDePalavras = 0;
        this.numeroDeAcertos = 0;
        this.quantidadeDeVidas = 0;
    }

    @Override
    public String mostrarPalavra() {
        palavra = bancoDePalavras.getPalavra();
        return "Tente acertar qual e a palavra: " + embaralhador.embaralhar(palavra);
    }

    @Override
    public String verificarPalavraDigitada(String palavraDoJogador) {
        if (palavra.equals(palavraDoJogador)) {
            adicionaPontuacao(palavra.length());
            numeroDePalavras++;
            numeroDeAcertos++;
            if (numeroDeAcertos == 5 || numeroDeAcertos == 10 || numeroDeAcertos == 15){
                numeroDeErros = numeroDeErros - 1;
                quantidadeDeVidas++;
            }
            return "Acertou, a palavra e: " + palavra + "\n" + "Voce esta com: " + pontuacao + " pontos" + mostraTotalDeVidas();
        } else {
            numeroDeErros++;
            numeroDePalavras++;
            pontuacao = pontuacao - 1;
            quantidadeDeVidas = quantidadeDeVidas -1;
            return "Errou, a palavra e: " + palavra + "\n" + "Voce esta com: " + pontuacao + " pontos" + mostraTotalDeVidas();
        }
    }

    @Override
    public Boolean fimDoJogo() {
        if (numeroDePalavras < 20) {
            if (numeroDeErros < 1) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override
    public void adicionaPontuacao(int numeroDeLetras) {
        pontuacao = pontuacao + 1;
    }

    public String mostraTotalDeVidas(){
        String texto = "";
        if (quantidadeDeVidas == 1) {
            texto = "\nVoce possui " + quantidadeDeVidas + " vida";
        } else if (quantidadeDeVidas > 1){
            texto = "\nVoce possui " + quantidadeDeVidas + " vidas";
        }
        return texto;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
