package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Fornecedor;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class FornecedorDAO {

	private Connection conexao;

	public void inserirFornecedor(Fornecedor fornecedor) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_fornecedor (id_fornecedor, id_localizacao, nm_fornecedor) VALUES (?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, fornecedor.getIdFornecedor());
			stmt.setString(2, fornecedor.getIdLocalizacao().getIdLocalizacao());
			stmt.setString(3, fornecedor.getNmFornecedor());

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
		System.out.println("Fornecedor inserido com sucesso !");
	}
}
