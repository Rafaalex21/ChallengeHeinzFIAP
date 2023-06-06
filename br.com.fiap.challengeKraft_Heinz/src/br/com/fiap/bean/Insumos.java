package br.com.fiap.bean;

public class Insumos {
	
	private String idInsumo;
	private Tipo tipo = new Tipo();
	private UnidadeMedida idMedida = new UnidadeMedida();
	private Requisicao idRequisicao = new Requisicao();
	private String nmInsumo;
	private float vrUnitario;
	
	public Insumos() {
	
	}

	
	public Insumos(String idInsumo, Tipo tipo, UnidadeMedida idMedida, Requisicao idRequisicao, String nmInsumo,
			float vrUnitario) {
		super();
		this.idInsumo = idInsumo;
		this.tipo = tipo;
		this.idMedida = idMedida;
		this.idRequisicao = idRequisicao;
		this.nmInsumo = nmInsumo;
		this.vrUnitario = vrUnitario;
	}


	public String getIdInsumo() {
		return idInsumo;
	}

	public void setIdInsumo(String idInsumo) {
		this.idInsumo = idInsumo;
	}

	public UnidadeMedida getIdMedida() {
		return idMedida;
	}

	public void setIdMedida(UnidadeMedida idMedida) {
		this.idMedida = idMedida;
	}

	public Requisicao getIdRequisicao() {
		return idRequisicao;
	}

	public void setIdRequisicao(Requisicao idRequisicao) {
		this.idRequisicao = idRequisicao;
	}

	public String getNmInsumo() {
		return nmInsumo;
	}

	public void setNmInsumo(String nmInsumo) {
		this.nmInsumo = nmInsumo;
	}

	public float getVrUnitario() {
		return vrUnitario;
	}

	public void setVrUnitario(float vrUnitario) {
		this.vrUnitario = vrUnitario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
