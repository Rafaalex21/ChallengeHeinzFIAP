package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.ProdComposicao;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class ProdComposicaoDAO {

	private Connection conexao;

	public void inserirComposicao(ProdComposicao composicao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_prod_composicao (id_insumo, id_produto, qtd_insumo) VALUES (?,?,?)";

			stmt = conexao.prepareStatement(sql);

			
			stmt.setString(1, composicao.getIdInsumo().getIdInsumo());
			stmt.setString(2, composicao.getIdProduto().getIdProduto());
			stmt.setInt(3, composicao.getQtdInsumo());


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
		System.out.println("ProdComposicao inserido com sucesso !");
	}
}
