import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author George Alan
 *
 */
public class Pizza {

	static HashMap<String, Integer> ingredientesTotais = new HashMap<>();
	HashMap<String, Integer> ingredientesDaPizza = new HashMap<>();
	
	//M�todo que adiciona os ingredientes.
	void adicionaIngrediente(String ingrediente) {
		int ingredientesDaPizza = this.ingredientesDaPizza.getOrDefault(ingrediente, 0);
		this.ingredientesDaPizza.put(ingrediente, ++ingredientesDaPizza);

		contabilizaIngrediente(ingrediente);
	}
	
	//M�todo que contabiliza os ingredientes da Pizza.
	static void contabilizaIngrediente(String ingrediente) {
		int ingredientesTotais = Pizza.ingredientesTotais.getOrDefault(ingrediente, 0);
		Pizza.ingredientesTotais.put(ingrediente, ++ingredientesTotais);
	}
	
	// M�todo estatico que zera os ingredientes da Pizza.
	static void zerarIngredientes() {
		Pizza.ingredientesTotais.clear();
	}
	
	//M�todo que soma os ingredientes da Pizza.
	int totalIgredientesDaPizza() {
		int total = 0;
		for (Map.Entry<String, Integer> entry : ingredientesDaPizza.entrySet()) {
			total += entry.getValue();
		}
		return total;
	}
	
	//M�todo que calcula o pre�o total dos ingredientes da Pizza, de acordo com a quantidade.
	int getPreco() {
		int total = totalIgredientesDaPizza();
		if (total <= 2) {
			return 15;
		} else if (total >= 3 && total <= 5) {
			return 20;
		}
		return 22;
	}
}
