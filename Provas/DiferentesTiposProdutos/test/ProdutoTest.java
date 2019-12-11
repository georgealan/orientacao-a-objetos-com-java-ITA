
import static org.junit.Assert.*;

import org.junit.Test;

import com.loja.beans.Produto;

/**
 * Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e
 * para a classe CarrinhoDeCompras. Os testes de cada classe devem ser colocados
 * em classes separadas e devem estar em um diretório de código diferente das
 * classes de produção.
 * 
 * @author George Alan
 *
 */

public class ProdutoTest {

	@Test
	public void equalsMesmoCodigo() {
		Produto camisetaNike = new Produto("Camiseta Nike", "CBK561", 355.90);
		Produto camisetaAdidas = new Produto("Camiseta Adidas", "CBK561", 280.40);
		assertEquals(camisetaNike, camisetaAdidas);
	}

	@Test
	public void equalsCodigoDiferente() {
		Produto camisetaNike = new Produto("Camiseta Nike", "CM1A", 355.90);
		Produto camisetaAdidas = new Produto("Camiseta Adidas", "CM2B", 280.40);
		assertNotEquals(camisetaNike, camisetaAdidas);
	}

	@Test
	public void hashCodeCodigoDiferente() {
		Produto camisetaNike = new Produto("Camiseta Nike", "CM5F", 355.90);
		Produto camisetaAdidas = new Produto("Camiseta Adidas", "CM8J", 280.40);
		assertNotEquals(camisetaNike.hashCode(), camisetaAdidas.hashCode());
	}

	@Test
	public void hashCodeMesmoCodigo() {
		Produto camisetaNike = new Produto("Camiseta Nike", "CMA4", 355.90);
		Produto camisetaAdidas = new Produto("Camiseta Adidas", "CMA4", 280.40);
		assertEquals(camisetaNike.hashCode(), camisetaAdidas.hashCode());
	}
}
