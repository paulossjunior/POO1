package br.edu.ifes.poo1.blackwhite.model;

import java.util.ArrayList;

public class Cafe {
	
	protected Double preco;
	
	protected ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	
	private final int QTDAGUA = 100;
	
	public Cafe()
	{
		
		for (int contador = 0; contador < QTDAGUA; contador++ )
		{
			Agua agua = new Agua();
			ingredientes.add(agua);
		}
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
		

	

}
