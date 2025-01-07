package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection conectaBD() {
        Connection conn = null;
        try {
            // URL do banco de dados
            String url = "jdbc:mysql://localhost:3307/mercado"; // Substitua 'mercado' pelo nome do seu banco
            String usuario = "root"; // Substitua pelo seu usuário do banco
            String senha = "catolica"; // Substitua pela sua senha do banco

            // Conectando ao banco de dados
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }

        return conn;
    }
}
