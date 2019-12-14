package com.tratamento.recursos;

import com.tratamento.interfaces.FormatadorNome;

/**
 * ComT�tulo: deve receber em seu construtor o t�tulo e retornar o t�tulo
 * seguido de nome e sobrenome. Exemplo: "Magn�fico Pedro Cabral".
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
