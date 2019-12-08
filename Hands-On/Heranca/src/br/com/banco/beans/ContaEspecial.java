package br.com.banco.beans;

public class ContaEspecial extends ContaCorrente{

    protected int limite;

    ContaEspecial(int limite){
        this.limite = limite;
    }

    public int sacar(int valor) {
        if (valor > (saldo + limite)){
            return 0;
        }else{
            valor = saldo -= valor;
            return valor;
        }
    }
}
