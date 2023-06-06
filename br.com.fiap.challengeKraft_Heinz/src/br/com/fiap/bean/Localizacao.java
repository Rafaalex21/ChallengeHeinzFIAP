package br.com.fiap.bean;

public class Localizacao {
	
	private String idLocalizacao;
	private String endereco; 
	private String cidade; 
	private String estado; 
	private String pais;
	private Empresa empresa = new Empresa();
	
	public Localizacao() {
		
	}


	

	public Localizacao(String idLocalizacao, String endereco, String cidade, String estado, String pais, Empresa empresa) {

		this.idLocalizacao = idLocalizacao;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.empresa = empresa;
	}




	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getIdLocalizacao() {
		return idLocalizacao;
	}

	public void setIdLocalizacao(String idLocalizacao) {
		this.idLocalizacao = idLocalizacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
	
	

}
