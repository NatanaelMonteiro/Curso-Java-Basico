package br.com.natanael.aula35;

public class CalcFatorialRecursivo {
	
	public int fatorial(int num) {
		
		if(num == 0) {
			
			return 1;
			
		}
		
		return num * fatorial(num-1);
		
	}

}
