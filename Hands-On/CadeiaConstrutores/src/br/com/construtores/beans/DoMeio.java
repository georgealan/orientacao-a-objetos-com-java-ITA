package br.com.construtores.beans;

public class DoMeio extends PaiDeTodos{

    /**
     * Repare que iniciamos o construtor da super classe no construtor desta classe, e passamos
     * o parametro necessário para a inicialização do construtor. Sem essa chamada super() com o
     * parametro setado, teriamos um erro na classe.
     */
    public DoMeio(){
        super("parametro");
        System.out.println("Construtor do meio");
    }
}
