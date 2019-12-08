import static org.junit.Assert.*;

import org.junit.Test;

public class CarrinhoDeComprasTest {

	// Verifica se os preços das pizzas são somados corretamente.
	@Test
	public void somaCorreta() {
		// Instancias das classes
		Pizza calabresa = new Pizza();
		Pizza mussarela = new Pizza();
		Pizza bauru = new Pizza();
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		// Adicionando os ingredientes
		calabresa.adicionaIngrediente("Linguica calabresa");
		calabresa.adicionaIngrediente("Cebola");

		mussarela.adicionaIngrediente("Queijo Mussarela");
		mussarela.adicionaIngrediente("Azeitonas");
		mussarela.adicionaIngrediente("Tomates");

		bauru.adicionaIngrediente("Queijo Mussarela");
		bauru.adicionaIngrediente("Presunto");
		bauru.adicionaIngrediente("Azeitonas");
		bauru.adicionaIngrediente("Tomates");
		bauru.adicionaIngrediente("Mangericao");
		bauru.adicionaIngrediente("Catupiri");

		// Adicionando ao carrinho de compras
		carrinhoDeCompras.adicionarPizza(calabresa);
		carrinhoDeCompras.adicionarPizza(mussarela);
		carrinhoDeCompras.adicionarPizza(bauru);

		// Verificando
		assertEquals(57, carrinhoDeCompras.totalDoCarrinho());
	}

	// Verifica se impede a adição de uma pizza sem ingrediente.
	@Test
	public void pizzaSemIngrediente() {
		Pizza pizzaSemIngrediente = new Pizza();
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarPizza(pizzaSemIngrediente);

		assertEquals(0, carrinhoDeCompras.totalDePizzas());
	}

}
