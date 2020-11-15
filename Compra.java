package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	 public ArrayList<Item> itens = new ArrayList<Item>();
	
	public Compra(Item item) {
		itens.add(item);
	}
	
	
	 double obterValorDaCompra() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;

	}
	
	 public void adicionarCompra(Item item) {
		 itens.add(item);
	 }
	 
	 void dadosCompra() {
		for (Item item : itens) {
			System.out.println(item + "\n");
			
		}
	 }
	 
}
