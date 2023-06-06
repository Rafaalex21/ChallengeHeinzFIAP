package br.com.fiap.bean;

public class Produto {
	
	private String idProduto;
	private UnidadeMedida unidadeMedida = new UnidadeMedida();
	private String nmProduto;
	private float vrUnitario;
	private boolean status;
	
	public Produto() {
	
	}

	public Produto(String idProduto, UnidadeMedida unidadeMedida, String nmProduto, float vrUnitario, boolean status) {
		this.idProduto = idProduto;
		this.unidadeMedida = unidadeMedida;
		this.nmProduto = nmProduto;
		this.vrUnitario = vrUnitario;
		this.status = status;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public float getVrUnitario() {
		return vrUnitario;
	}

	public void setVrUnitario(float vrUnitario) {
		this.vrUnitario = vrUnitario;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
	
	