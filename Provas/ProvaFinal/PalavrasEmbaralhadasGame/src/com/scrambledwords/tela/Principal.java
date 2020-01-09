package com.scrambledwords.tela;

import com.scrambledwords.interfaces.MecanicaDoJogo;
import com.scrambledwords.services.FabricaMecanicaDoJogo;

import java.util.Scanner;

public class Principal {
    public static int recorde;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcao = "";
        String nomeJogador = "";

        System.out.println("\nDigite o nome do jogador: ");
        nomeJogador = teclado.next();

        System.out.println("\nEscolha uma opção de jogo abaixo: \n");
        System.out.println("Digite 1 para jogar no modo livre, onde você tenta acertar 20 palavras.\n");
        System.out.println("Digite 2 para jogar no modo 3 erros, onde se você errar 3 palavras o jogo termina.\n");
        System.out.println("Digite 3 para jogar no modo 1 erro, onde se você errar 1 palavra o jogo termina.\n");
        System.out.println("Digite 4 para jogar no modo 1 erro 5 acertos ganha 1 vida, onde se você acertar 5 palavras ganha uma vida.\n");
        opcao = teclado.next();

        if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4")) {
            MecanicaDoJogo mecanica = new FabricaMecanicaDoJogo().getMecanica(Integer.parseInt(opcao));

            while (!mecanica.fimDoJogo()) {
                System.out.println("\n------------------------------------------------------------------------");
                System.out.println(mecanica.mostrarPalavra());
                String palavraDigitada = teclado.next();
                System.out.println(" ");
                System.out.println(mecanica.verificarPalavraDigitada(palavraDigitada));
                System.out.println("------------------------------------------------------------------------");
            }

            if (mecanica.getPontuacao() > recorde) {
                recorde = mecanica.getPontuacao();
                System.out.println("\n========================================================================");
                System.out.println("Parabéns você quebrou o Recorde");
                System.out.println("Novo Recorde: " + mecanica.getPontuacao());
                System.out.println("========================================================================");
            }

            System.out.println("\n========================================================================");
            System.out.println("Fim do jogo!\n");
            System.out.println(nomeJogador + " sua pontução foi: " + mecanica.getPontuacao() + " pontos.\n");
            System.out.println("Recorde: " + recorde);
            System.out.println("========================================================================\n");
            System.out.println("Deseja jogar novamente? ");
            System.out.println("Responda 's' para Sim ou 'n' para Não: ");
            if (teclado.next().equals("s")) {
                main(null);
            }
        } else {
            System.out.println("\nA opção digitada não existe! Por favor selecione a opção 1 ou 2!\n");
            System.out.println("========================================================================");
            main(null);
        }
    }
}
