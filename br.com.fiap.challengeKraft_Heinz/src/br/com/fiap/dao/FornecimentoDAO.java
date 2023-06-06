package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Fornecimento;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class FornecimentoDAO {

	private Connection conexao;

	public void inserirFornecimento(Fornecimento fornecimento) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_fornecimento (id_fornecedor, id_insumo) VALUES (?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, fornecimento.getIdFornecedor().getIdFornecedor());
			stmt.setString(2, fornecimento.getIdInsumo().getIdInsumo());

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
		System.out.println("Fornecimento inserido com sucesso !");
	}
}
