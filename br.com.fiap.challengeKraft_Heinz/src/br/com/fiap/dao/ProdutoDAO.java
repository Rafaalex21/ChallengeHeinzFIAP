package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Produto;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class ProdutoDAO {

	private Connection conexao;

	public void inserirProduto(Produto produto) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_produto (id_produto, id_medida, nm_produto, vr_unitario, status) VALUES (?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, produto.getIdProduto());
			stmt.setString(2, produto.getUnidadeMedida().getIdMedida());
			stmt.setString(3, produto.getNmProduto());
			stmt.setFloat(4, produto.getVrUnitario());
			stmt.setBoolean(5, produto.isStatus());

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
		System.out.println("Produto inserido com sucesso !");
	}
}
