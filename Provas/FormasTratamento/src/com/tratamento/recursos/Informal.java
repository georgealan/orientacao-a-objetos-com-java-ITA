package com.tratamento.recursos;

import com.tratamento.interfaces.FormatadorNome;

/**
 * Informal: retorna somente o primeiro nome.
 * 
 * @author George Alan
 *
 */

public class Informal implements FormatadorNome {
	@Override
	public String formatarNome(String nome, String sobrenome) {
		return nome;
	}
}
