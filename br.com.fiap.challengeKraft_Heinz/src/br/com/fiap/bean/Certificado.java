package br.com.fiap.bean;

import java.sql.Date;

public class Certificado {
	
	private String idCertificado;
	private String nmCertificado;
	private Fornecedor fornecedor = new Fornecedor();
	private String orgEmissor;
	private String nrAutenticacao;
	private Date dtEmissao;
	private Date dtValidade;
	
	public Certificado() {
	
	}

	public Certificado(String idCertificado, String nmCertificado, Fornecedor fornecedor, String orgEmissor,
			String nrAutenticacao, Date dtEmissao, Date dtValidade) {
		
		this.idCertificado = idCertificado;
		this.nmCertificado = nmCertificado;
		this.fornecedor = fornecedor;
		this.orgEmissor = orgEmissor;
		this.nrAutenticacao = nrAutenticacao;
		this.dtEmissao = dtEmissao;
		this.dtValidade = dtValidade;
	}

	public String getIdCertificado() {
		return idCertificado;
	}

	public void setIdCertificado(String idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getNmCertificado() {
		return nmCertificado;
	}

	public void setNmCertificado(String nmCertificado) {
		this.nmCertificado = nmCertificado;
	}

	public Fornecedor getIdFornecedor() {
		return fornecedor;
	}

	public void setIdFornecedor(Fornecedor idFornecedor) {
		this.fornecedor = idFornecedor;
	}

	public String getOrgEmissor() {
		return orgEmissor;
	}

	public void setOrgEmissor(String orgEmissor) {
		this.orgEmissor = orgEmissor;
	}

	public String getNrAutenticacao() {
		return nrAutenticacao;
	}

	public void setNrAutenticacao(String nrAutenticacao) {
		this.nrAutenticacao = nrAutenticacao;
	}

	public Date getDtEmissao() {
		return dtEmissao;
	}

	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	public Date getDtValidade() {
		return dtValidade;
	}

	public void setDtValidade(Date dtValidade) {
		this.dtValidade = dtValidade;
	}
	
	
	
	
	
	
	
	

}
