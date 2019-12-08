import static org.junit.Assert.*;

import org.junit.Test;

import br.com.calculoimc.beans.Paciente;

public class PacienteTest {

	@Test
	public void baixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(20.1, 1.57);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 16.0;

		imc = imc < 16.0 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void baixoPesoGrave() {
		Paciente paciente = new Paciente(30.5, 1.38);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 17.0;

		imc = imc == 16.0 || imc <= 16.99 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void baixoPeso() {
		Paciente paciente = new Paciente(58.5, 1.78);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 18.50;

		imc = imc == 17.0 || imc <= 18.49 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void pesoNormal() {
		Paciente paciente = new Paciente(68.5, 1.78);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 25.0;

		imc = imc == 18.50 || imc <= 24.99 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void sobrepeso() {
		Paciente paciente = new Paciente(88.5, 1.78);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 30.0;

		imc = imc == 25.0 || imc <= 29.99 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void obesidadeGrauI() {
		Paciente paciente = new Paciente(98.5, 1.78);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 35.0;

		imc = imc == 30.0 || imc <= 34.99 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void obesidadeGrauII() {
		Paciente paciente = new Paciente(88.5, 1.58);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 40.0;

		imc = imc == 35.0 || imc <= 39.99 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

	@Test
	public void obesidadeGrauIII() {
		Paciente paciente = new Paciente(105.5, 1.58);
		double imc = paciente.calcularIMC();
		double imcIntervalo = 39.99;

		imc = imc > 40.0 ? imcIntervalo = imc : imcIntervalo;

		assertEquals(imcIntervalo, paciente.calcularIMC(), 0.01);
	}

}
