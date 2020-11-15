package oo.composicao.desafio;

import java.text.NumberFormat;

public class Produto {
	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome do produto: " + this.nome + "\nPreço " + NumberFormat.getCurrencyInstance().format(this.preco) ;
	}
}
