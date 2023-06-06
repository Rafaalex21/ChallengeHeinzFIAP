package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Producao;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class ProducaoDAO {

	private Connection conexao;

	public void inserirProducao(Producao producao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_producao (id_producao, id_produto, id_empresa, id_requisicao, qtd_producao, dt_producao) VALUES (?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, producao.getIdProducao());
			stmt.setString(2, producao.getIdProduto().getIdProduto());
			stmt.setString(3, producao.getIdEmpresa().getIdEmpresa());
			stmt.setString(4, producao.getIdRequisicao().getIdRequisicao());
			stmt.setInt(5, producao.getQtdProducao());
			stmt.setDate(6, producao.getDtProducao());

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
		System.out.println("Producao inserido com sucesso !");
	}
}
