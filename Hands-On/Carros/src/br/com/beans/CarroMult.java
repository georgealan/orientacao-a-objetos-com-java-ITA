package br.com.beans;

public class CarroMult extends CarroDeCorrida{

    private double potencia;

    /**
     * Construtor desta super classe
     *
     * @param nome
     * @param velocidadeMaxima
     */
    public CarroMult(String nome, double potencia, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        if (potencia > 1 && potencia < 2){
            this.potencia = potencia;
        } else {
            this.potencia = 1.5;
        }
    }

    // Método sobrescrito da super classe CarroDeCorrida, caracterizando polimorfismo.
    @Override
    public void acelerar() {
        if (velocidade == 0){
            velocidade = 10;
        } else{
            velocidade *= potencia;
            velocidade = getVelocidade() > velocidadeMaxima ? velocidade = velocidadeMaxima : getVelocidade();
        }

    }
}
