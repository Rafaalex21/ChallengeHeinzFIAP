package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Meta;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class MetaDAO {

	private Connection conexao;

	public void inserirMeta(Meta meta) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_meta (id_meta, id_objetivo, nm_meta, ds_meta, dt_inicio, dt_fim, vr_alvo, qtd_alvo) VALUES (?,?,?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, meta.getIdMeta());
			stmt.setString(2, meta.getIdObjetivo().getIdObjetivo());
			stmt.setString(3, meta.getNmMeta());
			stmt.setString(4,meta.getDsMeta());
			stmt.setDate(5, meta.getDtInicio());
			stmt.setDate(6, meta.getDtFim());
			stmt.setFloat(7, meta.getVrAlvo());
			stmt.setFloat(8, meta.getQtdAlvo());

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
		System.out.println("Meta inserida com sucesso !");
	}
}
