package br.com.experiencia.beans;

public class Referencia {
    int modificadorDefault;
    public int modificadorPublico;
    protected int modificadorProtegido;
    private int modificadorPrivado;

    public void testeAcesso(){
        modificadorDefault = 0;
        modificadorPublico = 0;
        modificadorProtegido = 0;
        modificadorPrivado = 0;
    }
}
