package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;


import br.com.fiap.bean.EmpObjetivo;
import br.com.fiap.jdbc.ChallengeDBmanager;

public class EmpObjetivoDAO {

    private Connection conexao;

    public void inserirEmpObjetivo(EmpObjetivo empObjetivo) {
        PreparedStatement stmt = null;

        try {
            conexao = ChallengeDBmanager.obterConexao();

            String sql = "INSERT INTO t_emp_objetivo (id_objetivo, id_empresa) VALUES (?, ?)";

            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, empObjetivo.getIdObjetivo().getIdObjetivo()); 
            stmt.setString(2, empObjetivo.getIdEmpresa().getIdEmpresa());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    	System.out.println("EmpObjetivo inserido com sucesso !");
    }
}

