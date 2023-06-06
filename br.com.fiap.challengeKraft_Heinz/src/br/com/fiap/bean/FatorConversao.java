package br.com.fiap.bean;

public class FatorConversao {
	
	private String idFator;
	private UnidadeMedida unidadeMedia = new UnidadeMedida();
	private float fatorConversao;
	private String dsUnidOrigem;
	private String dsUnidDestino;
	
	public FatorConversao() {
		
	}
	public FatorConversao(String idFator, UnidadeMedida unidadeMedia, float fatorConversao, String dsUnidOrigem,
			String dsUnidDestino) {
		
		this.idFator = idFator;
		this.unidadeMedia = unidadeMedia;
		this.fatorConversao = fatorConversao;
		this.dsUnidOrigem = dsUnidOrigem;
		this.dsUnidDestino = dsUnidDestino;
	}
	public String getIdFator() {
		return idFator;
	}
	public void setIdFator(String idFator) {
		this.idFator = idFator;
	}
	public UnidadeMedida getUnidadeMedia() {
		return unidadeMedia;
	}
	public void setUnidadeMedia(UnidadeMedida unidadeMedia) {
		this.unidadeMedia = unidadeMedia;
	}
	public float getFatorConversao() {
		return fatorConversao;
	}
	public void setFatorConversao(float fatorConversao) {
		this.fatorConversao = fatorConversao;
	}
	public String getDsUnidOrigem() {
		return dsUnidOrigem;
	}
	public void setDsUnidOrigem(String dsUnidOrigem) {
		this.dsUnidOrigem = dsUnidOrigem;
	}
	public String getDsUnidDestino() {
		return dsUnidDestino;
	}
	public void setDsUnidDestino(String dsUnidDestino) {
		this.dsUnidDestino = dsUnidDestino;
	}
	
	
	

}
