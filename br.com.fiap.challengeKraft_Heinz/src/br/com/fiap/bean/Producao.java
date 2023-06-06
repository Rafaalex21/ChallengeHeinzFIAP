package br.com.fiap.bean;

import java.sql.Date;

public class Producao {
	
	private String idProducao;
	private Produto produto = new Produto();
	private Empresa empresa = new Empresa();
	private Requisicao requisicao = new Requisicao();
	private int qtdProducao;
	private Date dtProducao;
	
	public Producao() {
	}
	
	public Producao(String idProducao, Produto idProduto, Empresa idEmpresa, Requisicao idRequisicao, int qtdProducao,
			Date dtProducao) {
		this.idProducao = idProducao;
		this.produto = idProduto;
		this.empresa = idEmpresa;
		this.requisicao = idRequisicao;
		this.qtdProducao = qtdProducao;
		this.dtProducao = dtProducao;
		
	}
	public String getIdProducao() {
		return idProducao;
	}
	public void setIdProducao(String idProducao) {
		this.idProducao = idProducao;
	}
	public Produto getIdProduto() {
		return produto;
	}
	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}
	public Empresa getIdEmpresa() {
		return empresa;
	}
	public void setIdEmpresa(Empresa idEmpresa) {
		this.empresa = idEmpresa;
	}
	public Requisicao getIdRequisicao() {
		return requisicao;
	}
	public void setIdRequisicao(Requisicao idRequisicao) {
		this.requisicao = idRequisicao;
	}
	public int getQtdProducao() {
		return qtdProducao;
	}
	public void setQtdProducao(int qtdProducao) {
		this.qtdProducao = qtdProducao;
	}
	public Date getDtProducao() {
		return dtProducao;
	}
	public void setDtProducao(Date dtProducao) {
		this.dtProducao = dtProducao;
	}


}
