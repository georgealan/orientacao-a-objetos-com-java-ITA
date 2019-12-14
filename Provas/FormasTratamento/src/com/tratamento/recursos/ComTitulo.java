package com.tratamento.recursos;

import com.tratamento.interfaces.FormatadorNome;

/**
 * ComTítulo: deve receber em seu construtor o título e retornar o título
 * seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral".
 * 
 * @author George Alan
 *
 */

public class ComTitulo implements FormatadorNome {
	
	private String titulo;
	
	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}
}
