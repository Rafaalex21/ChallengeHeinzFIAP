package br.com.fiap.bean;

public class Fornecimento {

	private Insumos insumo = new Insumos();
	private Fornecedor fornecedor = new Fornecedor();
	
	public Fornecimento() {

	}

	public Fornecimento(Insumos idInsumo, Fornecedor idFornecedor) {
		super();
		this.insumo = idInsumo;
		this.fornecedor = idFornecedor;
	}

	public Insumos getIdInsumo() {
		return insumo;
	}

	public void setIdInsumo(Insumos idInsumo) {
		this.insumo = idInsumo;
	}

	public Fornecedor getIdFornecedor() {
		return fornecedor;
	}

	public void setIdFornecedor(Fornecedor idFornecedor) {
		this.fornecedor = idFornecedor;
	}
	
	
	
	
}
