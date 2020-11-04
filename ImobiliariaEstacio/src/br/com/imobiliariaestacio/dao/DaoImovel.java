package br.com.imobiliariaestacio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.imobiliariaestacio.model.Imovel;
import br.com.imobiliariaestacio.sql.ConnectionFactory;
import br.com.imobiliariaestacio.sql.SQLUtil;

public class DaoImovel implements IDaoImovel{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;	
	
	public Imovel salvarImovel(Imovel imovel) throws Exception {
		 try {
		    	conexao = ConnectionFactory.getConnection();
		    	
		    	this.statement = conexao.prepareStatement(SQLUtil.ImovelSQL.INSERT_IMOVEL);
		    	this.statement.setString(1, imovel.getTipo());
		    	this.statement.setInt(2, imovel.getValor());
		    	this.statement.setString(3, imovel.getStatus());
		    	this.statement.setString(4, imovel.getArea());
		    	this.statement.setInt(5, imovel.getCodigoImovel());
		    	this.statement.setInt(6, imovel.getId_endereco());
	    	
		    	this.result = statement.executeQuery();
		    	this.result.next();
		    	imovel.setId(result.getInt(1));

		    	
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Deu erro!");
			}
			return imovel;
	}
	
//	public Imovel 

}
