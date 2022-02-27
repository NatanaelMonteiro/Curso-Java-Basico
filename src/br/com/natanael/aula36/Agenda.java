package br.com.natanael.aula36;

public class Agenda {

	private String nome;
	private ContatosAgenda[] contatos;

	public Agenda() {
	}
	public Agenda(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ContatosAgenda[] getContatos() {
		return contatos;
	}
	public void setContatos(ContatosAgenda[] contatos) {
		this.contatos = contatos;
	}

	public String obterInfo() {
		String info = "Nome = " + nome + "\n" + "\n";
		
		if (contatos != null) {
			for (ContatosAgenda c : contatos) {
				info += c.obterInfo() + "\n" + "\n";
			}
		}
		
		return info;
	}
}
