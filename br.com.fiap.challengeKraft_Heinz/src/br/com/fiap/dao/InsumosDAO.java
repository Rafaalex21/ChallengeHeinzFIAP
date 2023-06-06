package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Insumos;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class InsumosDAO {

	private Connection conexao;

	public void inserirInsumos(Insumos insumo) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_insumos (id_insumo,id_tipo ,id_medida, id_requisicao, nm_insumo, vr_unitario) VALUES (?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, insumo.getIdInsumo());
			stmt.setString(2, insumo.getTipo().getIdTipo());
			stmt.setString(3, insumo.getIdMedida().getIdMedida());
			stmt.setString(4, insumo.getIdRequisicao().getIdRequisicao());
			stmt.setString(5, insumo.getNmInsumo());
			stmt.setFloat(6, insumo.getVrUnitario());

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
		System.out.println("Insumo inserido com sucesso !");
	}
}
