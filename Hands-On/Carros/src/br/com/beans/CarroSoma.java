package br.com.beans;

/**
 * Utilizei aqui o refactor pull members up, para enviar os métodos e atributos para a super classe
 * CarroDeCorrida, os atributos e métodos lá foram exportados desta classe com o refactor pull members up.
 */

public class CarroSoma extends CarroDeCorrida{
    private int potencia;

    public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        this.potencia = potencia;
    }

    // Método sobrescrito da super classe CarroDeCorrida, caracterizando polimorfismo.
    @Override
    public void acelerar() {
        velocidade += potencia;
        velocidade = getVelocidade() > velocidadeMaxima ? velocidade = velocidadeMaxima : getVelocidade();
    }

}
