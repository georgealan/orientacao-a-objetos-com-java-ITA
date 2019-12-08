package br.com.beans;

public class Carro {
    int potencia;
    int velocidade;
    String nome;

    public void acelerar(){
        velocidade += potencia;
    }

    public void frear(){
        velocidade = velocidade / 2;
    }

    int getVelocidade(){
        return velocidade;
    }

    public void imprimir(){
        System.out.println("O carro " + nome + " esta a velocidade de " + getVelocidade() + " km/h");
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
