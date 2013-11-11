package br.edu.ifes.poo1.blackwhite.model;

public class CafeNormal extends CafeComum {

	private final int QTDSoluvel = 100;
	
	public CafeNormal()
	{
		for (int contador = 0; contador < QTDSoluvel; contador++ )
		{
			CafeSoluvel cafeSoluvel = new CafeSoluvel();
			ingredientes.add(cafeSoluvel);
		}
	}
	
	
}
