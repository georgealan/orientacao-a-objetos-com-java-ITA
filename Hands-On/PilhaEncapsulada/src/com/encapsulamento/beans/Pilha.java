package com.encapsulamento.beans;

public class Pilha {

    private Object[] elements;
    private int topo = 0;

    // Construtor da classe
    public Pilha(int maximo){
        elements = new Object[maximo];
    }

    // Empilha os objetos
    public void empilhar(Object element){
        elements[topo] = element;
        topo++;
    }

    // Remove um objeto que está no topo da pilha.
    public Object desempilhar(){
        topo--;
        return elements[topo];
    }

    // Retorna o objeto no topo
    public Object topo(){
        return elements[topo-1];
    }

    // Retorna o tamanho da pilha
    public int tamanhoDaPilha(){
        return topo;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
