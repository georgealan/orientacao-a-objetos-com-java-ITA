package br.com.banco.beans;

import br.com.banco.interfaces.ContaCorrenteInterface;

public class ContaCorrente implements ContaCorrenteInterface {

    protected int saldo;
    
    @Override
    public int sacar(int valor) {
        if (valor > saldo){
            return 0;
        }else{
            saldo -= valor;
            return valor;
        }
    }

    @Override
    public void depositar(int valor) {
        saldo += valor;
    }
}
