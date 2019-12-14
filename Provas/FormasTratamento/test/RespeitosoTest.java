import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tratamento.enums.Sexo;
import com.tratamento.recursos.Respeitoso;

public class RespeitosoTest {

	Respeitoso homem;
	Respeitoso mulher;

	@Before
	public void homenMulher() {
		homem = new Respeitoso(Sexo.Masculino);
		mulher = new Respeitoso(Sexo.Feminino);
	}

	@Test
	public void pessoaRespeitosaHomem() {
		String tratamento = homem.formatarNome("George", "Alan");
		assertEquals("Sr. George Alan", tratamento);
	}

	@Test
	public void pessoaRespeitosaHomemErro() {
		String tratamento = homem.formatarNome("George", "Alan");
		assertNotEquals("Sr. George", tratamento);
	}

	@Test
	public void pessoaRespeitosaHomemErroSexo() {
		String tratamento = homem.formatarNome("George", "Alan");
		assertNotEquals("Sra. George Alan", tratamento);
	}

	// ==========================================================

	@Test
	public void pessoaRespeitosaMulher() {
		String tratamento = mulher.formatarNome("Catia", "Fonseca");
		assertEquals("Sra. Catia Fonseca", tratamento);
	}

	@Test
	public void pessoaRespeitosaMulherErro() {
		String tratamento = mulher.formatarNome("Catia", "Fonseca");
		assertNotEquals("Sra. Catia", tratamento);
	}

	@Test
	public void pessoaRespeitosaMulherErroSexo() {
		String tratamento = mulher.formatarNome("Catia", "Fonseca");
		assertNotEquals("Sr. Catia Fonseca", tratamento);
	}
}
