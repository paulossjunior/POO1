package br.edu.ifes.poo1.clinica.cih;

import java.util.Scanner;

public class TelaCadastro {

	private String dados[] = new String[4];
	
	private Scanner scanner = new Scanner(System.in);		
			
	public String[] exibirCadastroMedico ()
	{
		String valor;
		
		System.out.print("Cadastrar");
		
		System.out.print("Digite o nome:");
		
		valor = scanner.nextLine();
		
		dados[0]= valor;
		
		System.out.print("Digite o CRM:");
		
		valor = scanner.nextLine();
		
		dados[1]= valor;
		
		System.out.print("Digite o Endereco:");
		
		valor = scanner.nextLine();
		
		dados[2]= valor;
		
		System.out.print("Digite o Telefone:");
		
		valor = scanner.nextLine();
		
		dados[3]= valor;
		
		return dados;
		
	}
	
	
}
