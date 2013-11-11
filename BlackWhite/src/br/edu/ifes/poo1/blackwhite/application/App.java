package br.edu.ifes.poo1.blackwhite.application;

import br.edu.ifes.poo1.blackwhite.model.CafeNormal;
import br.edu.ifes.poo1.blackwhite.model.Ingrediente;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CafeNormal cafeNormal = new CafeNormal();
		System.out.print(cafeNormal.getIngredientes().size());
		
		for (Ingrediente ingrediente: cafeNormal.getIngredientes())
		{
			System.out.println(ingrediente.toString());
		}
	}

}
