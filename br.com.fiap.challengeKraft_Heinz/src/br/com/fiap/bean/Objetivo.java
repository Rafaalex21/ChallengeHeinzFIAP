package br.com.fiap.bean;

import java.sql.Date;

public class Objetivo {
	
	private String idObjetivo;
	private Produto produto = new Produto ();
	private String nmObjtivo;
	private String dsObjetivo;
	private Date dtInicio;
	private Date dtFim;
	
	public Objetivo() {
	
	}

	

	public Objetivo(String idObjetivo, Produto produto, String nmObjtivo, String dsObjetivo, Date dtInicio, Date dtFim) {
		this.idObjetivo = idObjetivo;
		this.produto = produto;
		this.nmObjtivo = nmObjtivo;
		this.dsObjetivo = dsObjetivo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}



	public String getIdObjetivo() {
		return idObjetivo;
	}

	public void setIdObjetivo(String idObjetivo) {
		this.idObjetivo = idObjetivo;
	}

	public Produto getIdProduto() {
		return produto;
	}

	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}

	public String getNmObjtivo() {
		return nmObjtivo;
	}

	public void setNmObjtivo(String nmObjtivo) {
		this.nmObjtivo = nmObjtivo;
	}

	public Date getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	public Date getDtFim() {
		return dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getDsObjetivo() {
		return dsObjetivo;
	}

	public void setDsObjetivo(String dsObjetivo) {
		this.dsObjetivo = dsObjetivo;
	}
	
	
	
	

}
