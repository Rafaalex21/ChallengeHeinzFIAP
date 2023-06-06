package br.com.fiap.bean;

import java.sql.Date;

public class Requisicao {
	
	private String idRequisicao;
	private Date dtRequisicao;
	private float qtdRequisicao;
	
	public Requisicao() {
	
	}
	public Requisicao(String idRequisicao, Date dtRequisicao, float qtdRequisicao) {
		
		this.idRequisicao = idRequisicao;
		this.dtRequisicao = dtRequisicao;
		this.qtdRequisicao = qtdRequisicao;
	}
	public String getIdRequisicao() {
		return idRequisicao;
	}
	public void setIdRequisicao(String idRequisicao) {
		this.idRequisicao = idRequisicao;
	}
	public Date getDtRequisicao() {
		return dtRequisicao;
	}
	public void setDtRequisicao(Date dtRequisicao) {
		this.dtRequisicao = dtRequisicao;
	}
	public float getQtdRequisicao() {
		return qtdRequisicao;
	}
	public void setQtdRequisicao(float qtdRequisicao) {
		this.qtdRequisicao = qtdRequisicao;
	}
	
	

}
