package br.com.natanael.aula56Teste;

public class TesteCalc {

	public enum Operacoes {

		SOMAR("+") {
			public double executarOperacoes(double x, double y) {
				return x + y;
			}
		}, SUBTRAIR("-") {
			public double executarOperacoes(double x, double y) {
				return x - y;
			}
		}, MULTIPLICAR("*") {
			public double executarOperacoes(double x, double y) {
				return x * y;
			}
		}, DIVIDIR("/") {
			public double executarOperacoes(double x, double y) {
				return x / y;
			}
		};
		
		private String sinal;
		
		Operacoes(String sinal){
			this.sinal = sinal;
		}
		
		public String toString(){
			return this.sinal;
		}
		
		public abstract double executarOperacoes(double x, double y);
	}
	
	public static void main(String[] args) {

		double x = 7.0;
		double y = 2.0;
		
		for (Operacoes op : Operacoes.values()){
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacoes(x, y));
		}
		
	}

}
