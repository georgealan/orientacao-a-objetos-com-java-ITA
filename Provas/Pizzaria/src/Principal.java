import java.util.Map.Entry;

/**
 * 
 * @author George Alan
 *
 */
public class Principal {

	public static void main(String[] args) {

		// Instâncias da classe Pizza e CarrinhoDeCompras
		Pizza pizzaBauru = new Pizza();
		Pizza pizzaCalabresa = new Pizza();
		Pizza pizzaPicanha = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		// Adicionando ingrediente para a pizza de bauru.
		pizzaBauru.adicionaIngrediente("Molho de Tomate");
		pizzaBauru.adicionaIngrediente("Mussarela");
		pizzaBauru.adicionaIngrediente("presunto");
		pizzaBauru.adicionaIngrediente("Oregano");
		pizzaBauru.adicionaIngrediente("Azeitonas");

		// Adicionando ingrediente para a pizza de calabresa.
		pizzaCalabresa.adicionaIngrediente("Calabresa");
		pizzaCalabresa.adicionaIngrediente("Cebola");

		// Adicionando ingrediente para a pizza de picanha
		pizzaPicanha.adicionaIngrediente("Molho de Tomate");
		pizzaPicanha.adicionaIngrediente("Mussarela");
		pizzaPicanha.adicionaIngrediente("Picanha Fatiada");
		pizzaPicanha.adicionaIngrediente("Cebola");
		pizzaPicanha.adicionaIngrediente("Oregano");
		pizzaPicanha.adicionaIngrediente("Azeitonas");
		pizzaPicanha.adicionaIngrediente("Alho");
		pizzaPicanha.adicionaIngrediente("Aliche");

		// Adicionando as pizzas ao carrinho de compras.
		carrinho.adicionarPizza(pizzaBauru);
		carrinho.adicionarPizza(pizzaCalabresa);
		carrinho.adicionarPizza(pizzaPicanha);

		// Imprimindo no console o preço das pizzas.
		System.out.println("__________________________________________");
		System.out.println("Valor unitario de cada pizza:\n");
		System.out.println("Preço da pizza de bauru: " + pizzaBauru.getPreco());
		System.out.println("Preço da pizza de calabresa: " + pizzaCalabresa.getPreco());
		System.out.println("Preço da pizza de picanha: " + pizzaPicanha.getPreco());

		// Imprimindo o preço total do carrinho de compras.
		System.out.println("__________________________________________");
		System.out.println("Preço total do carrinho de compras: " + carrinho.totalDoCarrinho());

		System.out.println("\n__________________________________________");
		System.out.println("Igredientes utilizados e quantidade:\n");

		for (Entry<String, Integer> igrediente : Pizza.ingredientesTotais.entrySet()) {
			System.out.println("Igrediente: "+ igrediente.getKey() + " quantidade: " + igrediente.getValue());
		}
	}
}
