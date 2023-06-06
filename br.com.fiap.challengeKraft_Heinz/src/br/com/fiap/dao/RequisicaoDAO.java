package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Requisicao;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class RequisicaoDAO {

	private Connection conexao;

	public void inserirRequisicao(Requisicao requisicao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_requisicao (id_requisicao, dt_requisicao, qtd_requisicao) VALUES (?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, requisicao.getIdRequisicao());
			stmt.setDate(2, requisicao.getDtRequisicao());
			stmt.setFloat(3, requisicao.getQtdRequisicao());

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
		System.out.println("Requisicao inserido com sucesso !");
	}
}
