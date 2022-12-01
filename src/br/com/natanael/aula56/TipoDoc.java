package br.com.natanael.aula56;

public enum TipoDoc {

	CPF {
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
	
}
