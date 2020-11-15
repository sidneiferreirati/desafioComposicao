package oo.composicao.desafio;



public class Loja {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Caneta", 1.00);
		Produto produto2 = new Produto("Borracha", 0.5);
		Produto produto3 = new Produto("Caderno", 15.00 );
		
		Compra compra1 = new Compra(new Item(new Produto("Notebook", 5000), 1));
		compra1.adicionarCompra((new Item(produto1, 1)));
		compra1.adicionarCompra(new Item(produto2, 5));
		compra1.adicionarCompra(new Item(produto3, 5));
		
		Compra compra2 = new Compra(new Item(new Produto("Teclado", 650), 2));
		
		Cliente cliente1 = new Cliente("Sidnei");
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		cliente1.notaFiscal();
		
	}
	
}
