package com.scrambledwords.services;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {
    private ArrayList<String> listaDePalavras;
    Scanner input = new Scanner(System.in);
    private String palavra;
    private int dificuldade;
    private String fileName;

    public BancoDePalavras(){
        lerArquivo();
    }

    public void lerArquivo(){
        listaDePalavras = new ArrayList<String>();
        dificuldade = 0;
        fileName = "";
        System.out.println("Escolha a dificuldade do jogo:");
        System.out.println("1 Easy, 2 Medium, 3 Hard, 4 Very Hard, 5 Ultimate, 6 Master:");
        dificuldade = input.nextInt();

        switch (dificuldade){
            case 1:
                fileName = "palavrasEasy.txt";
                break;
            case 2:
                fileName = "palavrasMedium.txt";
                break;
            case 3:
                fileName = "palavrasHard.txt";
                break;
            case 4:
                fileName = "palavrasVeryHard.txt";
                break;
            case 5:
                fileName = "palavrasUltimate.txt";
                break;
            case 6:
                fileName = "palavrasMaster.txt";
                break;
            default:
                fileName = "palavrasEasy.txt";
                break;
        }

        try {
            FileReader arq = new FileReader(fileName);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                listaDePalavras.add(linha);
                linha = lerArq.readLine();
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro ao ler ou encontrar o arquivo: %s.\n", e.getMessage());
        }
    }

    public String getPalavra() {
        Random r = new Random();
        if (listaDePalavras.size() > 0) {
            int index = r.nextInt(listaDePalavras.size());
            palavra = listaDePalavras.get(index);
            listaDePalavras.remove(index);
        }
        return palavra;
    }
}
