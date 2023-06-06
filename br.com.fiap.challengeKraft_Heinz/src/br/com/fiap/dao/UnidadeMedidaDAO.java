package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.UnidadeMedida;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class UnidadeMedidaDAO {

	private Connection conexao;

	public void inserirUnidadeMedida(UnidadeMedida unidadeMedida) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_unid_medida (id_medida, ds_medida) VALUES (?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, unidadeMedida.getIdMedida());
			stmt.setString(2, unidadeMedida.getDsMedida());

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
		System.out.println("Unidade de medida inserida com sucesso!");
	}
}
