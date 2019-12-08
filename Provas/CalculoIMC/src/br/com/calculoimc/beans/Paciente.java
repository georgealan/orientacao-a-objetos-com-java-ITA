package br.com.calculoimc.beans;

import br.com.calculoimc.interfaces.AlunoInterface;

/**
 * Optei por usar o modelo de programação mais utilizado por min no dia a dia.
 * É um formato padrão que utiliza atributos privados para maior segurança e 
 * utilizo tanbém interface para assinar os métodos que irei utilizar aqui.
 *  
 * @author George Alan
 *
 */
public class Paciente implements AlunoInterface{
	
	// Declaração dos atributos de forma privada padrão de projetos Java
	private double peso;
	private double altura;
	
	// Construtor da classe
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	// Utilizando métodos Getters e Setters para utilizar os dados em outras classes.
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	/**
	 * Métodos equals and hashCode que servem para comparar objetos no Java, verifica
	 * se um objeto é igual ao outro.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Paciente other = (Paciente) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
		return true;
	}
	
	
	/**
	 * Método toString() que serve para mostrar o conteudo de um objeto na memória
	 * com os valores dos seus atributos em forma de String. Veja um exemplo na classe
	 * principal.
	 */
	@Override
	public String toString() {
		return "Paciente [peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	/**
	 * Implementação do método responsável pelo calculo do IMC.
	 */
	@Override
	public double calcularIMC() {
		double imc = 0.0;
		imc = this.peso / (this.altura * this.altura);

		return imc;	
	}
	
	
	/**
	 * Implementação do método responsável pelo diagnóstico de peso.
	 */
	@Override
	public String diagnostico() {
		double imc = calcularIMC();
		String mensagem = "";
		
		if(imc < 40.0) {
			if(imc < 16.0) {
				mensagem = "Baixo peso muito grave";
			}else if(imc == 16.0 || imc <= 16.99) {
				mensagem = "Baixo peso grave";
			}else if(imc == 17.0 || imc <= 18.49) {
				mensagem = "Baixo peso";
			}else if(imc == 18.50 || imc <= 24.99) {
				mensagem = "Peso normal";
			}else if(imc == 25.0 || imc <= 29.99) {
				mensagem = "Sobrepeso";
			}else if(imc == 30.0 || imc <= 34.99) {
				mensagem = "Obesidade grau I ";
			}else if(imc == 35.0 || imc <= 39.99) {
				mensagem = "Obesidade grau II ";
			}
		} else if(imc >= 40.0) {
			mensagem = "Obesidade grau III (obesidade mórbida)";
		}
		
		return mensagem;
	}
}
