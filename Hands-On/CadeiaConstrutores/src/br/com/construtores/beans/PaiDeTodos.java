package br.com.construtores.beans;

public class PaiDeTodos {

    /**
     * Ao inserir um parametro no construtor, obrigatóriamente será necessário colocar
     * uma chamada super() no método da classe que herda desta super classe, inicializando
     * o parametro necessário, este exemplo é visto na classe DoMeio que herda desta classe.
     * @param s
     */
    public PaiDeTodos(String s){
        System.out.println("Construtor pai de todos" + s);
    }
}
