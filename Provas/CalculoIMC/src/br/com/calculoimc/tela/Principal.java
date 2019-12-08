package br.com.calculoimc.tela;

import br.com.calculoimc.beans.Paciente;

/**
 * Classe execut�vel.
 * 
 * @author George Alan
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		//Inst�ncias da classe Paciente
		Paciente paciente1 = new Paciente(95.4, 1.27);
		Paciente paciente2 = new Paciente(21.8, 1.57);
		Paciente paciente3 = new Paciente(47.3, 1.22);
		
		// Utilizando o m�todo de dignostico() 
		System.out.println("O Paciente1 est� com " + paciente1.diagnostico());
		System.out.println("O Paciente2 est� com " + paciente2.diagnostico());
		System.out.println("O Paciente3 est� com " + paciente3.diagnostico());
		System.out.println("===================================================\n");
		
		
		/**
		 * Aqui um exemplo do porque utilizar o m�todo toString() l� na 
		 * classe Paciente, quando chamamos o objeto na tela aparece os atributo
		 * em forma de String, experimente remover o m�todo toString l� na classe 
		 * Paciente e vai retornar o nome da classe seguido de caracteres aleat�rios
		 * semelhantes a isso: @ht421d12 que representam a posi��o do objeto na mem�ria
		 * do Java.
 		 */
		System.out.println("===================================");
		System.out.println("Exemplo de uso do m�todo toString");
		System.out.println(paciente1);
		System.out.println(paciente2);
		System.out.println(paciente3);
		System.out.println("===================================");
	}
}
