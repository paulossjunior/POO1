package br.edu.ifes.poo1.clinica.cgt;

import java.util.ArrayList;

import br.edu.ifes.poo1.clinica.cdp.Medico;

public class ControleApp {
	
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	
	public void cadastrarMedico (String nome, String CRM, String endereco, String telefone)
	{
		Medico medico = new Medico(nome,CRM,endereco,telefone);
		
		System.err.println(medico);
		//Salvando em memoria
		medicos.add(medico);
	}
	
	public int informarQuantidaMedico()
	{
		return this.medicos.size();
	}

}
