package br.com.natanael.aula35;

public class CalcFatorial {
	
	public int calcFatorial(int num) {
		
		if (num == 0) {
			
			return 1;
			
		}
		
		int total = 1;
		for (int i=num; i>1; i--) {
			total *= i;
		}
		
		return total;
	}

}
