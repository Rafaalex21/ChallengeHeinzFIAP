package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Objetivo;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class ObjetivoDAO {

	private Connection conexao;

	public void inserirObjetivo(Objetivo objetivo) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_objetivo (id_objetivo, id_produto, mm_objetivo, ds_objetivo, dt_inicio, dt_fim) VALUES (?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, objetivo.getIdObjetivo());
			stmt.setString(2, objetivo.getIdProduto().getIdProduto());
			stmt.setString(3, objetivo.getNmObjtivo());
			stmt.setString(4, objetivo.getDsObjetivo());
			stmt.setDate(5, objetivo.getDtInicio());
			stmt.setDate(6, objetivo.getDtFim());
			
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
		System.out.println("Objetivo inserido com sucesso !");
	}
}
