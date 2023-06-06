package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Certificado;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class CertificadoDAO {

	private Connection conexao;

	public void inserirCertificado(Certificado certificado) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_certificado(id_certificado,id_fornecedor,nm_certificado,org_emissor,nr_autenticacao,dt_emissao,dt_validade) VALUES (?, ?, ?, ?, ?, ?, ?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, certificado.getIdCertificado());
			stmt.setString(2, certificado.getIdFornecedor().getIdFornecedor());
			stmt.setString(3, certificado.getNmCertificado());
			stmt.setString(4, certificado.getOrgEmissor());
			stmt.setString(5, certificado.getNrAutenticacao());
			stmt.setDate(6, certificado.getDtEmissao());
			stmt.setDate(7, certificado.getDtValidade());

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Certificado inserido com sucesso !");
	}
}


