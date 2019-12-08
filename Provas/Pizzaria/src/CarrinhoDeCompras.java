import java.util.ArrayList;

/**
 * 
 * @author George Alan
 *
 */
public class CarrinhoDeCompras {

	ArrayList<Pizza> pizzas = new ArrayList<>();

	void adicionarPizza(Pizza pizza) {
		if(pizza.totalIgredientesDaPizza() > 0) {
			pizzas.add(pizza);
		}
	}

	int totalDePizzas() {
		return pizzas.size();
	}

	int totalDoCarrinho() {
		int precoTotal = 0;
		for(Pizza pizza : pizzas) {
			precoTotal += pizza.getPreco();
		}
		return precoTotal;
	}
}
