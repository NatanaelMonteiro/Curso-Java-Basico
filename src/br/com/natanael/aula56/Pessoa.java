package br.com.natanael.aula56;

public class Pessoa {
	
	private TipoDoc tipoDoc;
	private String numeroDoc;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(TipoDoc tipoDoc, String numeroDoc) {
		super();
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
	}
	
	public TipoDoc getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDoc tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumeroDoc() {
		return numeroDoc;
	}
	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	public String toString() {
		return "Pessoa [tipoDoc=" + tipoDoc + ", numeroDoc=" + numeroDoc + "]";
	}
}
