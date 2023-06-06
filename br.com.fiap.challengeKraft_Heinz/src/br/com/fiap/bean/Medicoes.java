package br.com.fiap.bean;

public class Medicoes {

	private String idMedicao;
	private Producao producao = new Producao ();
	private UnidadeMedida unidadeMedida = new UnidadeMedida();
	private Tipo tipo = new Tipo();
	private float qtdProducao;
	
	public Medicoes() {
		
	}
	
	public Medicoes(String idMedicao, Producao producao, UnidadeMedida unidadeMedida, Tipo tipo, float qtdProducao) {
	
		this.idMedicao = idMedicao;
		this.producao = producao;
		this.unidadeMedida = unidadeMedida;
		this.tipo = tipo;
		this.qtdProducao = qtdProducao;
		}



	public String getIdMedicao() {
		return idMedicao;
	}

	public void setIdMedicao(String idMedicao) {
		this.idMedicao = idMedicao;
	}

	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public float getQtdProducao() {
		return qtdProducao;
	}

	public void setQtdProducao(float qtdProducao) {
		this.qtdProducao = qtdProducao;
	}
}