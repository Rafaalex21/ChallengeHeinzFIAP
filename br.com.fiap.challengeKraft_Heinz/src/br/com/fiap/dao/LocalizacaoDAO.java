package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.bean.Localizacao;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class LocalizacaoDAO {

	private Connection conexao;

	public void inserirLocalizacao(Localizacao localizacao) {

		PreparedStatement stmt = null;

		try {

			conexao = ChallengeDBmanager.obterConexao();

			String sql = "INSERT INTO t_localizacao (id_localizacao, ds_endereco, ds_cidade, ds_estado, ds_pais, id_empresa) VALUES (?,?,?,?,?,?)";

			stmt = conexao.prepareStatement(sql);

			stmt.setString(1, localizacao.getIdLocalizacao());
			stmt.setString(2, localizacao.getEndereco());
			stmt.setString(3, localizacao.getCidade());
			stmt.setString(4, localizacao.getEstado());
			stmt.setString(5, localizacao.getPais());
			stmt.setString(6, localizacao.getEmpresa().getIdEmpresa());

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
		System.out.println("Localização inserida com sucesso !");
	}
}
