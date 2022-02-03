package br.com.natanael.aula13;

public class OperadoresAritmetricos {

	public static void main(String[] args) {

		int result = 1 + 2;
		System.out.println(result);
		
		result = result - 1;
		System.out.println(result);
		
		result = result * 2;
		System.out.println(result);
		
		result = result / 2;
		System.out.println(result);
		
		result = result + 8;
		System.out.println(result);
		
		result = result % 7;
		System.out.println(result);
		
		String nomeUm = "Esta é";
		String nomeDois = " uma String concatenada.";
		String nomeTres = nomeUm + nomeDois;
		System.out.println(nomeTres);
		
		result = result + 1;
		System.out.println(result);
		
		result ++;
		System.out.println(result);
		
		System.out.println(result++);
		//mesma coisa que ...
		//System.out.println(result);
		//result = result + 1;
		//result += 1;
		
		System.out.println(++result);
		//mesma coisa que ...
		//result += 1;
		//System.out.println(result);
		
		result--;
		System.out.println(result);
		System.out.println(result--);
		System.out.println(--result);
	}

}
