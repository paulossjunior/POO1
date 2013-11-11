package br.edu.ifes.poo1.blackwhite.model;

public class CafeSoluvel extends Ingrediente{

	public CafeSoluvel ()
	{
		this.unidadeMedida = "ml";
		this.nome = "cafeSoluvel";
	}
	
	public String toString()
	{
		return super.toString()+"Acorda Pedro!!";
	}
}
