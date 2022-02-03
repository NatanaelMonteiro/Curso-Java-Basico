package br.com.natanael.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso &
				verdadeiro;
		boolean resultado2 = falso &&
				verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		//So podemos ver a diferença ao debugar
		//Ele n executa a linha 12
		
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;
		System.out.println(resultado);
		
	}

}
