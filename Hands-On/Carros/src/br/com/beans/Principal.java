package br.com.beans;

public class Principal {
    public static void main(String[] args) {
        Corrida corridaDaAmizade = new Corrida(2000);

        corridaDaAmizade.adicionaCarro(new CarroSoma("Golf GTI", 10, 110));
        corridaDaAmizade.adicionaCarro(new CarroSoma("Mercedez", 8, 140));
        corridaDaAmizade.adicionaCarro(new CarroMult("Ferrari Enzo", 1.7, 100));
        corridaDaAmizade.adicionaCarro(new CarroMult("Lamborghini", 1.4, 150));

        corridaDaAmizade.unDoisTresEJa();


    }
}
