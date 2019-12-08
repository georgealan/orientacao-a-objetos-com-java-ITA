import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class PizzaTest {

	// Zera os ingredientes
	@After
	public void limpaIngredientes() {
		Pizza.zerarIngredientes();
	}

	// Verifica com 2 ingredientes.
	@Test
	public void ValorPizza15IngredientesTest() {
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Linguiça Calabresa");
		calabresa.adicionaIngrediente("Cebola");
		assertEquals(15, calabresa.getPreco());
	}

	// Verifica com 5 ingredientes.
	@Test
	public void ValorPizza20IngredientesTest() {
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Linguiça Calabresa");
		calabresa.adicionaIngrediente("Cebola");
		calabresa.adicionaIngrediente("Oregano");
		calabresa.adicionaIngrediente("Mangericao");
		calabresa.adicionaIngrediente("Azeitonas");
		assertEquals(20, calabresa.getPreco());
	}

	// Verifica com 6 ingredientes.
	@Test
	public void ValorPizza22IngredientesTest() {
		Pizza calabresa = new Pizza();
		calabresa.adicionaIngrediente("Linguiça Calabresa");
		calabresa.adicionaIngrediente("Cebola");
		calabresa.adicionaIngrediente("Oregano");
		calabresa.adicionaIngrediente("Mangericao");
		calabresa.adicionaIngrediente("Azeitonas");
		calabresa.adicionaIngrediente("Catupiri");
		assertEquals(22, calabresa.getPreco());
	}
}
