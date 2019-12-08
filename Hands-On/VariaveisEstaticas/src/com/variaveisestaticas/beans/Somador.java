package com.variaveisestaticas.beans;

public class Somador {
    public String nome;
    public int valorInstancia = 0;
    static int valorEstatica = 0;

    public void somar(){
        valorInstancia++;
        valorEstatica++;
    }

    public void imprimir(){
        System.out.println("O somador "+nome+": instancia="+valorInstancia+" e estatica="+valorEstatica);
    }

}
