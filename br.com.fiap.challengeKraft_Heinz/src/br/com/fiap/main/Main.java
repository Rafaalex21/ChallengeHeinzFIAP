package br.com.fiap.main;

import java.sql.Date;

import br.com.fiap.bean.Certificado;
import br.com.fiap.bean.EmpObjetivo;
import br.com.fiap.bean.Empresa;
import br.com.fiap.bean.FatorConversao;
import br.com.fiap.bean.Fornecedor;
import br.com.fiap.bean.Fornecimento;
import br.com.fiap.bean.Insumos;
import br.com.fiap.bean.Localizacao;
import br.com.fiap.bean.Medicoes;
import br.com.fiap.bean.Meta;
import br.com.fiap.bean.Objetivo;
import br.com.fiap.bean.ProdComposicao;
import br.com.fiap.bean.Producao;
import br.com.fiap.bean.Produto;
import br.com.fiap.bean.Requisicao;
import br.com.fiap.bean.Tipo;
import br.com.fiap.bean.UnidadeMedida;
import br.com.fiap.dao.CertificadoDAO;
import br.com.fiap.dao.EmpObjetivoDAO;
import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.dao.FatorConversaoDAO;
import br.com.fiap.dao.FornecedorDAO;
import br.com.fiap.dao.FornecimentoDAO;
import br.com.fiap.dao.InsumosDAO;
import br.com.fiap.dao.LocalizacaoDAO;
import br.com.fiap.dao.MedicoesDAO;
import br.com.fiap.dao.MetaDAO;
import br.com.fiap.dao.ObjetivoDAO;
import br.com.fiap.dao.ProdComposicaoDAO;
import br.com.fiap.dao.ProducaoDAO;
import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.dao.RequisicaoDAO;
import br.com.fiap.dao.TipoDAO;
import br.com.fiap.dao.UnidadeMedidaDAO;


public class Main {

	public static void main(String[] args) {

		//Cadastro da Empresa :
		EmpresaDAO empresaDAO = new EmpresaDAO();
		Empresa empresa = new Empresa();

		empresa.setIdEmpresa("1");
		empresa.setNomeEmpresa("Heinz Ltda");

		empresaDAO.inserirEmpresa(empresa);


		//Cadatro da Localizacao
		
		LocalizacaoDAO localizacaoDAO = new LocalizacaoDAO();
		Localizacao localizacao = new Localizacao();
		
		localizacao.setIdLocalizacao("1");
		localizacao.setEndereco("Rua 17 Numero 235");
		localizacao.setCidade("Neropolis");
		localizacao.setEstado("Goias");
		localizacao.setPais("Brasil");
		localizacao.setEmpresa(empresa);
		
		localizacaoDAO.inserirLocalizacao(localizacao);
		
		//Cadastro Unidade Medida
		UnidadeMedida unidadeMedida = new UnidadeMedida();
		UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();
		
		unidadeMedida.setIdMedida("1");
		unidadeMedida.setDsMedida("KG");
		
		unidadeMedidaDAO.inserirUnidadeMedida(unidadeMedida);
		
		// Cadastro do produto
		Produto produto = new Produto();
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		
		produto.setIdProduto("1");
		produto.setNmProduto("Molho de Tomate");
		produto.setVrUnitario(5.50f);
		produto.setUnidadeMedida(unidadeMedida);
		produto.setStatus(true);
		
		produtoDAO.inserirProduto(produto);
			
		
		//Cadastro do Objetivo
		
		Objetivo objetivo = new Objetivo();
		ObjetivoDAO objetivoDAO = new ObjetivoDAO();
	
		objetivo.setIdObjetivo("1");
		objetivo.setIdProduto(produto);
		objetivo.setNmObjtivo("Reciclagem");
		objetivo.setDsObjetivo("Embalagens reciclaveis até 2030");
		Date datainicio = Date.valueOf("2023-05-01");
		objetivo.setDtInicio(datainicio);
		Date dataFim = Date.valueOf("2030-12-31");
		objetivo.setDtFim(dataFim);
		
		objetivoDAO.inserirObjetivo(objetivo);
		
	    //Cadastro da empresa x objetivo;
		
		EmpObjetivo empObjetivo = new EmpObjetivo();
		EmpObjetivoDAO empObjetivoDAO = new EmpObjetivoDAO();
		
		empObjetivo.setIdEmpresa(empresa);
		empObjetivo.setIdObjetivo(objetivo);
		
		empObjetivoDAO.inserirEmpObjetivo(empObjetivo);
		
		//cadastro da meta
		
		Meta meta = new Meta();
		MetaDAO metaDAO = new MetaDAO();
		
		meta.setIdMeta("1");
		meta.setIdObjetivo(objetivo);
		meta.setNmMeta("Fornecedores Certificados");
		meta.setDsMeta("Almentar 100 fornecedores certificados por nao usarem agro-toxicos");
		meta.setQtdAlvo(100);
		meta.setVrAlvo(0);
		Date dataIniMeta = Date.valueOf("2023-05-31");
		meta.setDtInicio(dataIniMeta);
		Date dataFimMeta = Date.valueOf("2023-06-31");
		meta.setDtFim(dataFimMeta);
		
		metaDAO.inserirMeta(meta);
		

		//Cadastro de requisicao
		
		Requisicao requisicao = new Requisicao ();
		RequisicaoDAO requisicaoDAO = new RequisicaoDAO();
		
		requisicao.setIdRequisicao("1");
		requisicao.setQtdRequisicao(20);
		Date dataRequisicao = Date.valueOf("2023-12-31");
		requisicao.setDtRequisicao(dataRequisicao);
		
		requisicaoDAO.inserirRequisicao(requisicao);	

		//Cadastro Fator de conversão
		
		FatorConversao fatorConversao = new FatorConversao();
		FatorConversaoDAO fatorConversaoDAO = new FatorConversaoDAO();
		
		fatorConversao.setIdFator("1");
		fatorConversao.setUnidadeMedia(unidadeMedida);
		fatorConversao.setFatorConversao(100);
		fatorConversao.setDsUnidOrigem("KG");
		fatorConversao.setDsUnidDestino("GR");
		
		fatorConversaoDAO.inserirFatorConversao(fatorConversao);
		
		//Cadastro de Tipo
		
		Tipo tipo = new Tipo();
		TipoDAO tipoDAO = new TipoDAO();
		
		tipo.setIdTipo("1");
		tipo.setDsTipo("Vegetal");
		
		tipoDAO.inserirTipo(tipo);
		
		
		//Cadastro de Insumo
		
		Insumos insumos = new Insumos();
		InsumosDAO insumosDAO = new InsumosDAO();
		
		insumos.setIdInsumo("1");
		insumos.setTipo(tipo);
		insumos.setIdMedida(unidadeMedida);
		insumos.setIdRequisicao(requisicao);
		insumos.setNmInsumo("Tomate fresco");
		insumos.setVrUnitario(100);
		
		insumosDAO.inserirInsumos(insumos);
		
		//Cadastro composicao de produto
		
		ProdComposicao prodComposicao = new ProdComposicao();
		ProdComposicaoDAO prodComposicaoDAO = new ProdComposicaoDAO();
		
		prodComposicao.setIdInsumo(insumos);
		prodComposicao.setIdProduto(produto);
		prodComposicao.setQtdInsumo(3);
		
		prodComposicaoDAO.inserirComposicao(prodComposicao);
		
		//Cadastro de Producao
		
		Producao producao = new Producao();
		ProducaoDAO producaoDAO = new ProducaoDAO();
		
		producao.setIdProducao("1");
		producao.setIdProduto(produto);
		producao.setIdRequisicao(requisicao);
		producao.setIdEmpresa(empresa);
		producao.setQtdProducao(10);
		Date dtProducao = Date.valueOf("2023-12-31");
		producao.setDtProducao(dtProducao);
		
		producaoDAO.inserirProducao(producao);
		
		//Cadastro medições
		
		Medicoes medicoes = new Medicoes();
		MedicoesDAO medicoesDAO = new MedicoesDAO();
		
		medicoes.setIdMedicao("1");
		medicoes.setProducao(producao);
		medicoes.setTipo(tipo);
		medicoes.setUnidadeMedida(unidadeMedida);
		medicoes.setQtdProducao(3);
	
		medicoesDAO.iserirMedicoes(medicoes);
		
		//Cadastro de Fornecedores
		
		Fornecedor fornecedor = new Fornecedor();
		FornecedorDAO fornecedorDAO = new FornecedorDAO();
		
		fornecedor.setIdFornecedor("1");
		fornecedor.setIdLocalizacao(localizacao);
		fornecedor.setNmFornecedor("Fazenda dos Tomates");
		
		fornecedorDAO.inserirFornecedor(fornecedor);
		
		Fornecimento fornecimento = new Fornecimento();
		FornecimentoDAO fornecimentoDAO = new FornecimentoDAO();
		
		fornecimento.setIdFornecedor(fornecedor);
		fornecimento.setIdInsumo(insumos);
		
		fornecimentoDAO.inserirFornecimento(fornecimento);
		
		//Cadastro Certificado
		
		Certificado certificado = new Certificado();
		CertificadoDAO certificadoDAO = new CertificadoDAO();
		
		certificado.setIdCertificado("1");
		certificado.setIdFornecedor(fornecedor);
		certificado.setNmCertificado("Certificação de produto livre de agro-toxico");
		certificado.setNrAutenticacao("12345b");
		certificado.setOrgEmissor("Secretaria Rural");
		Date dataEmissCerti = Date.valueOf("2025-12-31");
		certificado.setDtEmissao(dataEmissCerti);
		Date dataVenciCerti = Date.valueOf("2025-12-31");
		certificado.setDtValidade(dataVenciCerti);
		
		certificadoDAO.inserirCertificado(certificado);


	}

}
