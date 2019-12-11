package com.loja.beans;

/**
 * Enunciado da Prova: Crie uma classe chamada Produto que deve possuir um nome,
 * um c�digo e um pre�o. Sobrescreva os m�todos equals() e hashCode() de Object
 * (veja se��o sobre esses m�todos), de forma a serem considerados iguais
 * instancias de Produto que possuam o mesmo c�digo.
 * 
 * @author George Alan
 *
 */

public class Produto {
	protected String nome;
	protected String codigo;
	protected double preco;

	public Produto(String nome, String codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}
