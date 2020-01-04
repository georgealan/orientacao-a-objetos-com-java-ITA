package com.scrambledwords.interfaces;


public interface MecanicaDoJogo {
    public String mostrarPalavra();
    public String verificarPalavraDigitada(String palavraDoJogador);
    public Boolean fimDoJogo();
    public void adicionaPontuacao(int numeroDeLetras);
    public int getPontuacao();
}
