package br.com.imobiliariaestacio.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/bancoImobiliaria";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "Rildo@123";
    
    private static Connection conexao = null; 

	
	public static Connection getConnection() throws Exception {
		try {
			if (conexao == null || conexao.isClosed()) {
				conexao = DriverManager.getConnection(URL_POSTGRES, USUARIO_POSTGRES, SENHA_POSTGRES);
				System.out.println("Fez a conexão!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return conexao;
	}

	
}


