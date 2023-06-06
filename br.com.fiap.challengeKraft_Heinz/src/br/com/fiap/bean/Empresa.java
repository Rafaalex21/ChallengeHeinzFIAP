package br.com.fiap.bean;

public class Empresa {
	
	private String idEmpresa; 
	private String nmEmpresa;
	
	public Empresa() {
	}

	public Empresa(String idEmpresa, String nomeEmpresa) {
		this.idEmpresa = idEmpresa;
		this.nmEmpresa = nomeEmpresa;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nmEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nmEmpresa = nomeEmpresa;
	}

}
	
	