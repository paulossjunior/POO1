package br.edu.ifes.poo1.clinica.cci;

import br.edu.ifes.poo1.clinica.cgt.ControleApp;
import br.edu.ifes.poo1.clinica.cih.TelaCadastro;

public class ControleTeleCadastro {
	
	private TelaCadastro telaCadastro = new TelaCadastro();
	
	private ControleApp controleApp = new ControleApp();
	
	public void cadastrarMedico(){
		
		String dados[] = telaCadastro.exibirCadastroMedico();
		
		controleApp.cadastrarMedico(dados[0], dados[1], dados[2], dados[3]);
	}

}
