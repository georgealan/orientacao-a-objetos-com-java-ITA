import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tratamento.recursos.Informal;

public class InformalTest {
	
	Informal informal;
	
	@Before
	public void pessoa() {
		informal = new Informal();
	}
	
	@Test
	public void pessoaInformal() {
		String tratamento = informal.formatarNome("George", "Alan");
		assertEquals("George", tratamento);
	}
	
	@Test
	public void pessoaInformalErro() {	
		String tratamento = informal.formatarNome("George", "Alan");		
		assertNotEquals("Alan", tratamento);
	}
}
