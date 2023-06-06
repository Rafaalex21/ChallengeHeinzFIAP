package br.com.fiap.bean;

import java.sql.Date;

public class Meta {
	
	private String idMeta;
	private Objetivo objetivo = new Objetivo();
	private String nmMeta;
	private String dsMeta;
	private Date dtInicio;
	private Date dtFim;
	private float vrAlvo;
	private float qtdAlvo;
	
	public Meta() {
		
	}



	public Meta(String idMeta, Objetivo objetivo, String nmMeta, String dsMeta, Date dtInicio, Date dtFim, float vrAlvo,
			float qtdAlvo) {

		this.idMeta = idMeta;
		this.objetivo = objetivo;
		this.nmMeta = nmMeta;
		this.dsMeta = dsMeta;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.vrAlvo = vrAlvo;
		this.qtdAlvo = qtdAlvo;
	}

	public String getIdMeta() {
		return idMeta;
	}

	public void setIdMeta(String idMeta) {
		this.idMeta = idMeta;
	}

	public Objetivo getIdObjetivo() {
		return objetivo;
	}

	public void setIdObjetivo(Objetivo idObjetivo) {
		this.objetivo = idObjetivo;
	}

	public String getNmMeta() {
		return nmMeta;
	}

	public void setNmMeta(String nmMeta) {
		this.nmMeta = nmMeta;
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

	public float getVrAlvo() {
		return vrAlvo;
	}

	public void setVrAlvo(float vrAlvo) {
		this.vrAlvo = vrAlvo;
	}

	public float getQtdAlvo() {
		return qtdAlvo;
	}

	public void setQtdAlvo(float qtdAlvo) {
		this.qtdAlvo = qtdAlvo;
	}

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}

	public String getDsMeta() {
		return dsMeta;
	}

	public void setDsMeta(String dsMeta) {
		this.dsMeta = dsMeta;
	}
	
	
	
	
	
	
	

}
