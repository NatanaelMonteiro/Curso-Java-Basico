package br.com.natanael.aula39;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String celular;
	private String cpf;
	
	String nomeDefault; //default (classe + pacote)
	public String nomeVisivel; //todos pac tem acesso
	private String nomePrivado; //somente na propria classe
	protected String nomeProtegido; //tipo o default (classe + pacote + subclasses)
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
