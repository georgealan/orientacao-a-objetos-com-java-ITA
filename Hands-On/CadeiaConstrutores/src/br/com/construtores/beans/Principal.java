package br.com.construtores.beans;

/**
 * Repare que ao executar, o primeiro construtor que será evocado é o construtor da
 * superclasse PaiDeTodos, em segundo o construtor da classe DoMeio será o proximo e por
 * ultimo o construtor da classe LaDeBaixo sera evocado.
 */

public class Principal {
    public static void main(String[] args) {
        LaDeBaixo obj = new LaDeBaixo();
    }
}
