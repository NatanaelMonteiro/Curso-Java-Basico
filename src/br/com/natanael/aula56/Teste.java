package br.com.natanael.aula56;

public class Teste {

	public static void main(String[] args) {

		/*for (TipoDoc doc : TipoDoc.values()) {
			System.out.println(doc + " - " + doc.geraNumeroTeste());
		}*/
		
		Pessoa pf = new Pessoa();
		pf.setTipoDoc(Enum.valueOf(TipoDoc.class, "CPF"));
		pf.setNumeroDoc(pf.getTipoDoc().geraNumeroTeste());
		System.out.println(pf);
		
		Pessoa pj = new Pessoa();
		pj.setTipoDoc(Enum.valueOf(TipoDoc.class, "CNPJ"));
		pj.setNumeroDoc(pj.getTipoDoc().geraNumeroTeste());
		System.out.println(pj);
		
	}

}
