import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tratamento.recursos.ComTitulo;

public class ComTituloTest {
	
	ComTitulo juiz;
	ComTitulo presidente;
	ComTitulo medico;
	
	@Before
	public void pessoa() {
		juiz = new ComTitulo("Excelentissimo");
		presidente = new ComTitulo("Vossa Excelencia");
		medico = new ComTitulo("Doutor");
	}
	
	@Test
	public void pessoaComTituloJuiz() {
		String tratamento = juiz.formatarNome("Seiya", "de Pegaso");
		assertEquals("Excelentissimo Seiya de Pegaso", tratamento);
	}
	
	@Test
	public void pessoaComTituloJuizErro() {
		String tratamento = juiz.formatarNome("Seiya", "de Pegaso");
		assertNotEquals("Excelentissimo Seiya", tratamento);
	}
	
	@Test
	public void pessoaComTituloPresidente() {
		String tratamento = presidente.formatarNome("Aioros", "de Sagitario");
		assertEquals("Vossa Excelencia Aioros de Sagitario", tratamento);
	}
	
	@Test
	public void pessoaComTituloPresidenteErro() {
		String tratamento = presidente.formatarNome("Aioros", "de Sagitario");
		assertNotEquals("Vossa Excelencia Aioros", tratamento);
	}
	
	@Test
	public void pessoaComTituloMedico() {
		String tratamento = medico.formatarNome("House", "Philip");
		assertEquals("Doutor House Philip", tratamento);
	}
	
	@Test
	public void pessoaComTituloMedicoErro() {
		String tratamento = medico.formatarNome("House", "Philip");
		assertNotEquals("Doutor House", tratamento);
	}

}
