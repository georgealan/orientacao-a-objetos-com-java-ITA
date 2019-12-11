
import static org.junit.Assert.*;

import org.junit.Test;

import com.loja.beans.ProdutoComTamanho;

/**
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e
 * para a classe CarrinhoDeCompras. Os testes de cada classe devem ser colocados
 * em classes separadas e devem estar em um diretório de código diferente das
 * classes de produção.
 * 
 * @author George Alan
 *
 */

public class ProdutoComTamanhoTest extends ProdutoTest {

	@Test
	public void equalsMesmoTamanho() {
		ProdutoComTamanho camisetaNike1 = new ProdutoComTamanho("Camiseta Nike", "CM.NK01.PP", 200.52, "PP");
		ProdutoComTamanho camisetaNike2 = new ProdutoComTamanho("Camiseta Nike", "CM.NK01.PP", 250.50, "PP");
		assertEquals(camisetaNike1, camisetaNike2);
	}

	@Test
	public void equalsTamanhosDiferentes() {
		ProdutoComTamanho camisetaAdidas1 = new ProdutoComTamanho("Camiseta Adidas", "CM.AD07.M", 350.80, "M");
		ProdutoComTamanho camisetaAdidas2 = new ProdutoComTamanho("Camiseta Adidas", "CM.AD07.GG", 250.70, "GG");
		assertNotEquals(camisetaAdidas1, camisetaAdidas2);
	}

	@Test
	public void hashCodeProdutoMesmoTamanho() {
		ProdutoComTamanho tenisNike1 = new ProdutoComTamanho("Tenis Nike", "T025.42", 980.80, "42");
		ProdutoComTamanho tenisNike2 = new ProdutoComTamanho("Tenis Nike", "T025.42", 600.0, "42");
		assertEquals(tenisNike1.hashCode(), tenisNike2.hashCode());
	}

	@Test
	public void hashCodeProdutoTamanhoDiferente() {
		ProdutoComTamanho calçaJeans1 = new ProdutoComTamanho("Calça Jeans", "CD-357", 150.70, "48");
		ProdutoComTamanho calçaJeans2 = new ProdutoComTamanho("Calça Jeans", "CD-357", 150.70, "36");
		assertNotEquals(calçaJeans1.hashCode(), calçaJeans2.hashCode());
	}
}
