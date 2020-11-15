package oo.composicao.desafio;

import java.text.NumberFormat;

public class Item {
	Produto produto;
	int quantidade;
	
	public Item(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return produto + "\nQuantidade: " + this.quantidade +"\nTotal " + NumberFormat.getCurrencyInstance().format(valorDaCompraDoItem());
	}
	
	double valorDaCompraDoItem() {
		double total = 0 ;
		total = this.quantidade * produto.preco;
		return total;
	}
	
	
}
