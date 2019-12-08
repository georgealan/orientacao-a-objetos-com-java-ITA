package br.com.comercio.beans;

import java.util.Objects;

public class Compra {
    private int valorTotal;
    private int numeroParcelas;

    // A vista
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }

    // Parcelado
    public Compra(int qtdParcelas, int valorParcela){
        numeroParcelas = qtdParcelas;
        valorTotal = valorParcela * qtdParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public int getValorParcela(){
        return valorTotal / numeroParcelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compra)) return false;
        Compra compra = (Compra) o;
        return getValorTotal() == compra.getValorTotal() &&
                getNumeroParcelas() == compra.getNumeroParcelas();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValorTotal(), getNumeroParcelas());
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valorTotal=" + valorTotal +
                ", numeroParcelas=" + numeroParcelas +
                '}';
    }
}
