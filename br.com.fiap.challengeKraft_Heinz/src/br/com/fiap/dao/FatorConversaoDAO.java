package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.FatorConversao;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class FatorConversaoDAO {

	private Connection conexao;

	public void inserirFatorConversao(FatorConversao fatorConversao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_fator_conver (id_fator, id_medida, fator_conver, ds_unid_orig, ds_unid_dest) VALUES (?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, fatorConversao.getIdFator());
			stmt.setString(2, fatorConversao.getUnidadeMedia().getIdMedida());
			stmt.setDouble(3, fatorConversao.getFatorConversao());
			stmt.setString(4, fatorConversao.getDsUnidOrigem());
			stmt.setString(5, fatorConversao.getDsUnidDestino());

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
		System.out.println("FatorConversao inserido com sucesso !");
	}
}
 