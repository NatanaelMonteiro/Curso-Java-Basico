package br.com.natanael.aula41;

public class Aluno extends Pessoa {
	
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("0102030405");
		
		this.setCpf("0102030405");
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "endereço do aluno: ";
		
		s += this.getEndereco();
		
		return s;
	}

	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
	}

	
}
