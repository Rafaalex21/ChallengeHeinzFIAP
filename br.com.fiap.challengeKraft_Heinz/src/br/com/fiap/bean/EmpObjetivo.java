package br.com.fiap.bean;

public class EmpObjetivo {
	
	private Objetivo objetivo = new Objetivo();
	private Empresa empresa = new Empresa();
	
	public EmpObjetivo() {
		
	}
	
	public EmpObjetivo(Objetivo idObjetivo, Empresa idEmpresa) {
		super();
		this.objetivo = idObjetivo;
		this.empresa = idEmpresa;
	}

	public Objetivo getIdObjetivo() {
		return objetivo;
	}

	public void setIdObjetivo(Objetivo idObjetivo) {
		this.objetivo = idObjetivo;
	}

	public Empresa getIdEmpresa() {
		return empresa;
	}

	public void setIdEmpresa(Empresa idEmpresa) {
		this.empresa = idEmpresa;
	}
	
	
	
	

}
