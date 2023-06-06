package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Empresa;
import br.com.fiap.jdbc.ChallengeDBmanager;


public class EmpresaDAO {

	private Connection conexao;

	public void inserirEmpresa(Empresa empresa) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_empresa(id_empresa, nm_empresa) VALUES (?, ?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, empresa.getIdEmpresa());
			stmt.setString(2, empresa.getNomeEmpresa());

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
		System.out.println("Empresa inserida com sucesso !");
	}
}


