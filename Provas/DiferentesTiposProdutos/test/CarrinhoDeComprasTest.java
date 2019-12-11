
import static org.junit.Assert.*;

import org.junit.Test;

import com.loja.beans.CarrinhoDeCompras;
import com.loja.beans.Produto;
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

public class CarrinhoDeComprasTest {

	@Test
	public void adicionaProdutosDiferentes() {
		Produto tvSamsung = new Produto("TV Samsung", "TVS01", 2000.00);
		ProdutoComTamanho tvSamsung4k = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 1);
		carrinho.adicionaProduto(tvSamsung4k, 1);

		assertEquals(2, carrinho.quantidadeProdutosNoCarrinho());
	}

	@Test
	public void adicionaProdutoTamanhosDiferentes() {
		ProdutoComTamanho tvSamsung = new ProdutoComTamanho("TV Samsung", "TVS01", 2000.00, "25");
		ProdutoComTamanho tvSamsung4k = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 1);
		carrinho.adicionaProduto(tvSamsung4k, 1);

		assertEquals(2, carrinho.quantidadeProdutosNoCarrinho());
	}

	@Test
	public void adicionaProdutoTamanhosIguais() {
		ProdutoComTamanho tvSamsung = new ProdutoComTamanho("TV Samsung", "TVS01", 3000.00, "50");
		ProdutoComTamanho tvSamsung4k = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 1);
		carrinho.adicionaProduto(tvSamsung4k, 1);

		assertEquals(1, carrinho.quantidadeProdutosNoCarrinho());
	}

	@Test
	public void removeProduto() {
		Produto tvSamsung = new Produto("TV Samsung", "TVS01", 2000.00);
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 10);
		carrinho.removeProduto(tvSamsung, 2);

		assertEquals(16000, carrinho.calculaTotal(), 0.00);
	}

	@Test
	public void removeProdutoTamanhosDiferentes() {
		ProdutoComTamanho tvSamsung = new ProdutoComTamanho("TV Samsung", "TVS01", 3000.00, "27");
		ProdutoComTamanho tvSamsung4k = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 1);
		carrinho.adicionaProduto(tvSamsung4k, 1);
		carrinho.removeProduto(tvSamsung, 1);

		assertEquals(1, carrinho.quantidadeProdutosNoCarrinho());
	}

	@Test
	public void calculaTotal() {
		Produto tvSamsung = new Produto("TV Samsung", "TVS01", 2000.00);
		Produto tvSamsung2 = new Produto("TV Samsung", "TVS01", 2000.00);
		ProdutoComTamanho tvSamsung4k = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		ProdutoComTamanho tvSamsung4k2 = new ProdutoComTamanho("TV Samsung 4K", "TVS01", 4000.00, "50");
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaProduto(tvSamsung, 1);
		carrinho.adicionaProduto(tvSamsung2, 2);
		carrinho.adicionaProduto(tvSamsung4k, 3);
		carrinho.adicionaProduto(tvSamsung4k2, 1);

		assertEquals(22000, carrinho.calculaTotal(), 0.00);
	}
}
