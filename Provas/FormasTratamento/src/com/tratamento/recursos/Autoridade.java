package com.tratamento.recursos;

import com.tratamento.interfaces.FormatadorNome;

/**
 * Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome
 * e uma instância de FormatadorNome. Essa classe deve possuir um método
 * getTratamento() que delega a formatação do nome para a instância de
 * FormatadorNome.
 * 
 * Crie testes de unidade que fazem os testes da classe Autoridade com cada uma
 * das implementações da interface.
 * 
 * @author George Alan
 *
 */

public class Autoridade{
	
	private String nome;
	private String sobrenome;
	private FormatadorNome formatadorNome;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatadorNome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadorNome = formatadorNome;
	}
	
	public String getTratamento() {
		return this.formatadorNome.formatarNome(nome, sobrenome);
	}
}
