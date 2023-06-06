package br.com.fiap.bean;

public class Fornecedor {
	
	private String idFornecedor;
	private Localizacao localizacao = new Localizacao();
	private String nmFornecedor;
	
	public Fornecedor() {
	
	}

	public Fornecedor(String idFornecedor, Localizacao idLocalizacao, String nmFornecedor) {
		super();
		this.idFornecedor = idFornecedor;
		this.localizacao = idLocalizacao;
		this.nmFornecedor = nmFornecedor;
	}

	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public Localizacao getIdLocalizacao() {
		return localizacao;
	}

	public void setIdLocalizacao(Localizacao idLocalizacao) {
		this.localizacao = idLocalizacao;
	}

	public String getNmFornecedor() {
		return nmFornecedor;
	}

	public void setNmFornecedor(String nmFornecedor) {
		this.nmFornecedor = nmFornecedor;
	}
	
	
	
	

}
