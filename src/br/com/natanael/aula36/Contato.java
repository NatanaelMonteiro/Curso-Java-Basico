package br.com.natanael.aula36;

public class Contato {

	private Nome nome;
	private Endereco endereco;
	private Telefone[] telefones;
	
	public Nome getNome() {
		return nome;
	}
	public void setNome(Nome nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
}
