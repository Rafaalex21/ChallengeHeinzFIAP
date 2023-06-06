package br.com.fiap.bean;

public class UnidadeMedida {
	
	private String idMedida;
	private String dsMedida;
	
	public UnidadeMedida() {
		
	}

	public UnidadeMedida(String idMedida, String dsMedida) {
		
		this.idMedida = idMedida;
		this.dsMedida = dsMedida;
	}

	public String getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(String idMedida) {
		this.idMedida = idMedida;
	}

	public String getDsMedida() {
		return dsMedida;
	}

	public void setDsMedida(String dsMedida) {
		this.dsMedida = dsMedida;
	}
	
	
	
	
	

}
