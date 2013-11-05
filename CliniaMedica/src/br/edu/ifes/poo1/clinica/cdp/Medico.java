package br.edu.ifes.poo1.clinica.cdp;

import java.util.ArrayList;

public class Medico {

	private ArrayList<HorarioAtendimento> horarioAtendimentos = new ArrayList<HorarioAtendimento>();
	
	private ArrayList<PlanoSaude> planoSaudes = new ArrayList<PlanoSaude>();
	
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
	private String nome;
	
	private String crm;
	
	private String endereco;
	
	private String telefone;

	
	public Medico(String nome, String crm, String endereco, String telefone) {
		this.nome = nome;
		this.crm = crm;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String toString(){
		return "Nome:"+nome+"CRM: e agora jose!?";
	}

	
	public void cadastrarHorario(HorarioAtendimento horarioAtendimento)
	{
		this.horarioAtendimentos.add(horarioAtendimento);
	}
	
	public ArrayList<HorarioAtendimento> obterHorarios()
	{
		return horarioAtendimentos;
	}

	public ArrayList<PlanoSaude> obterPlanoSaude()
	{
		return planoSaudes;
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Consulta> obterConsultas()
	{
		return consultas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
