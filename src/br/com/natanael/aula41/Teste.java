package br.com.natanael.aula41;

import br.com.natanael.aula41.Aluno;
import br.com.natanael.aula41.Pessoa;
import br.com.natanael.aula41.Professor;

public class Teste {
	
	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("rua 1");
		aluno.setEndereco("rua 2");
		professor.setEndereco("rua 3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
