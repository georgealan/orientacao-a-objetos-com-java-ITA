package com.tratamento.recursos;

import com.tratamento.enums.Sexo;
import com.tratamento.interfaces.FormatadorNome;

/**
 * Respeitoso: deve receber em seu construtor a informação se é masculino ou
 * feminino, e retornar "Sr." ou "Sra." seguido do sobrenome.
 * 
 * @author George Alan
 *
 */

public class Respeitoso implements FormatadorNome {

	private String formalidade;

	public Respeitoso(Sexo sexo) {
		formalidade = sexo == Sexo.Masculino ? "Sr." : "Sra.";
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return formalidade + " " + nome + " " + sobrenome;
	}
}
