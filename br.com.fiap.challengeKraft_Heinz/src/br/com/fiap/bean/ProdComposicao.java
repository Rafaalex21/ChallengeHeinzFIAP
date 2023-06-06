package br.com.fiap.bean;

public class ProdComposicao {
	
	private Insumos insumo = new Insumos();
	private Produto produto = new Produto();
	private int qtdInsumo;
	
	public ProdComposicao() {
	}

	public ProdComposicao(Insumos idInsumo, Produto idProduto, int qtdComposicao) {
		super();
		this.insumo = idInsumo;
		this.produto = idProduto;
		this.qtdInsumo = qtdComposicao;
	}

	public Insumos getIdInsumo() {
		return insumo;
	}

	public void setIdInsumo(Insumos idInsumo) {
		this.insumo = idInsumo;
	}

	public Produto getIdProduto() {
		return produto;
	}

	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}

	public Insumos getInsumo() {
		return insumo;
	}

	public void setInsumo(Insumos insumo) {
		this.insumo = insumo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQtdInsumo() {
		return qtdInsumo;
	}

	public void setQtdInsumo(int qtdInsumo) {
		this.qtdInsumo = qtdInsumo;
	}


	
	
	
	
	

}
