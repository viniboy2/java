package TesteConexao;

public class Teste {

    package Teste; // Certifique-se de ajustar para o pacote correto do seu projeto

import Dao.ConexaoDAO;
import java.sql.Connection;

    public class TesteConexao {
        public static void main(String[] args) {
            ConexaoDAO conexao = new ConexaoDAO();
            Connection conn = conexao.conectaBD(); // Chama o método que estabelece a conexão com o banco

            if (conn != null) {
                System.out.println("Conexão bem-sucedida!");
            } else {
                System.out.println("Falha ao conectar ao banco de dados.");
            }
        }
    }
}
