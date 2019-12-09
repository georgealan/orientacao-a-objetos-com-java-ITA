package br.com.beans;

public abstract class CarroDeCorrida {

    protected int velocidade;
    protected int velocidadeMaxima;
    String nome;

    /**
     * Construtor desta super classe
     * @param nome
     * @param velocidadeMaxima
     */
    public CarroDeCorrida(String nome, int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
    }

    public abstract void acelerar();

    public void frear() {
        velocidade = velocidade / 2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
