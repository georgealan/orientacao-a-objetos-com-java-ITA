package com.loja.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo
 * HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O
 * método adicionaProduto() deve receber a instancia do produto e a quantidade.
 * Caso o produto já exista no HashMap, a quantidade deve ser somada a que já
 * existe no carrinho. Deve haver também um método removeProduto() que também
 * recebe a instancia do produto e a quantidade a ser removida. Observe que
 * produtos de tamanhos diferentes devem ser considerados como produtos
 * diferentes no carrinho. O carrinho deve possuir um método que calcula o valor
 * total da compra.
 * 
 * @author George Alan
 *
 */

public class CarrinhoDeCompras {

	private Map<Produto, Integer> produtos = new HashMap<Produto, Integer>();

	public void adicionaProduto(Produto produto, int quantidade) {
		int quantidadeNoCarrinho = produtos.getOrDefault(produto, 0);
		quantidadeNoCarrinho += quantidade;
		produtos.put(produto, quantidadeNoCarrinho);
	}

	public void removeProduto(Produto produto, int quantidade) {
		int quantidadeNoCarrinho = produtos.getOrDefault(produto, 0);
		quantidadeNoCarrinho -= quantidade;

		quantidadeNoCarrinho = quantidadeNoCarrinho < 1 ? produtos.remove(produto)
				: produtos.put(produto, quantidadeNoCarrinho);
	}

	public int quantidadeProdutosNoCarrinho() {
		return produtos.size();
	}

	public double calculaTotal() {
		double total = 0;
		for (Map.Entry<Produto, Integer> entry : produtos.entrySet()) {
			Produto p = entry.getKey();
			int quantidade = entry.getValue();
			total += p.preco * quantidade;
		}
		return total;
	}
}
