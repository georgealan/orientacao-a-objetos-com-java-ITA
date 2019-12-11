package com.loja.beans;

/**
 * Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa
 * classe deve possuir uma informação adicional de tamanho. Um exemplo seria o
 * tamanho de uma roupa ou a numeração de um calçado. Método equals() e
 * hashCode() devem ser sobrescritos de forma que um produto com mesmo código e
 * tamanhos diferentes são considerados diferentes.
 * 
 * @author George Alan
 *
 */

public class ProdutoComTamanho extends Produto {

	private String tamanho;

	public ProdutoComTamanho(String nome, String codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (tamanho == null) {
			if (other.tamanho != null)
				return false;
		} else if (!tamanho.equals(other.tamanho))
			return false;
		return true;
	}
}
