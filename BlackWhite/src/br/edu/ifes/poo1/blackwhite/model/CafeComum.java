package br.edu.ifes.poo1.blackwhite.model;

public class CafeComum extends Cafe{

	
	private final int QTDLEITE = 100;
	private final int QTDACUCAR = 2;	
	
	public CafeComum()
	{
		for (int contador = 0; contador < QTDLEITE; contador++ )
		{
			Leite leite = new Leite();
			ingredientes.add(leite);
		}
		
		for (int contador = 0; contador < QTDACUCAR; contador++ )
		{
			Acucar acucar = new Acucar();
			ingredientes.add(acucar);
		}
		
		
	}
	
}
