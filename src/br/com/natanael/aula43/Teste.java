package br.com.natanael.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Desenvolvedor Java");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);

		System.out.println(aluno);
		
		String s1 = "abcd";
		String s2 = "abcD";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Desenvolvedor Java");
		double[] notas2 = {9, 8, 6, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}