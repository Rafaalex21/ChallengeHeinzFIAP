package br.com.fiap.bean;

public class Tipo {
	
	private String idTipo;
	private String dsTipo;
	
	
	public Tipo() {
	
	}

	public Tipo(String idTipo, String dsTipo) {
		super();
		this.idTipo = idTipo;
		this.dsTipo = dsTipo;
	}

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getDsTipo() {
		return dsTipo;
	}

	public void setDsTipo(String dsTipo) {
		this.dsTipo = dsTipo;
	}
	
	
	
	

}
