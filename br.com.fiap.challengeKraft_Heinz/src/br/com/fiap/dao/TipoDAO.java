package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Tipo;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class TipoDAO {

	private Connection conexao;

	public void inserirTipo(Tipo tipo) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_tipo (id_tipo, ds_tipo) VALUES (?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, tipo.getIdTipo());
			stmt.setString(2, tipo.getDsTipo());

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
		System.out.println("Tipo inserido com sucesso!");
	}
}
