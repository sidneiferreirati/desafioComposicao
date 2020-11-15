package oo.composicao.desafio;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Cliente {
		String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	private ArrayList<Compra> compras = new ArrayList<Compra>();
	
	
	private double obterValorDasComprasDoCliente() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.obterValorDaCompra();
		}
		return total;
	}
	
	public void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	void notaFiscal() {
		System.out.println("               Nota Fiscal " + this.nome + "\n");
		for (Compra compra : compras) {
			compra.dadosCompra();
		}
		System.out.println("Total: " +  NumberFormat.getCurrencyInstance().format(obterValorDasComprasDoCliente()));
	}
	
	
}
