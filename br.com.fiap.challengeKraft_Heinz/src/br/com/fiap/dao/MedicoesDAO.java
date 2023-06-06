package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Medicoes;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class MedicoesDAO {

	private Connection conexao;

	public void iserirMedicoes(Medicoes medicao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_medicoes (id_medicao, id_producao, id_medida, id_tipo, qtd_medicao) VALUES (?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, medicao.getIdMedicao());
			stmt.setString(2, medicao.getProducao().getIdProducao());
			stmt.setString(3, medicao.getUnidadeMedida().getIdMedida());
			stmt.setString(4, medicao.getTipo().getIdTipo());
			stmt.setFloat(5, medicao.getQtdProducao());

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
		System.out.println("Medições inserido com sucesso !");
	}
}
