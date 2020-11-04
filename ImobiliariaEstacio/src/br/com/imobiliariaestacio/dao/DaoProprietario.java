package br.com.imobiliariaestacio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.imobiliariaestacio.model.Proprietario;
import br.com.imobiliariaestacio.sql.ConnectionFactory;
import br.com.imobiliariaestacio.sql.SQLUtil;

public class DaoProprietario implements IDaoProprietario{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;	
	
	@Override
	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception {

		  try {
		    	conexao = ConnectionFactory.getConnection();
		    	
		    	this.statement = conexao.prepareStatement(SQLUtil.ProprietarioSQL.INSERT_PROPRIETARIO);
		    	this.statement.setString(1, proprietario.getNome());
		    	this.statement.setString(2, proprietario.getSobrenome());
		    	this.statement.setString(3, proprietario.getCpf());
		    	this.statement.setString(4, proprietario.getRg());
		    	this.statement.setInt(5, proprietario.getId_endereco());

		    	
		    	this.result = statement.executeQuery();
		    	this.result.next();
		    	proprietario.setId(result.getInt(1));

	    	
		    	this.statement.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return proprietario;
		}

	@Override
	public boolean buscarProprietarioCpf(String cpf) throws Exception {
		try {
	    	conexao = ConnectionFactory.getConnection();

            this.statement = conexao.prepareStatement(SQLUtil.ProprietarioSQL.SELECT_CPF_PROPRIETARIO);
            this.statement.setString(1, cpf);
            this.result = statement.executeQuery();
            
            if (result.next()) {
            	if (result.getString(1).equals(cpf)) {
					return true;
				}
            }
    		return false;

        }catch (Exception e) {
			e.printStackTrace();
			System.out.println("Deu pau na budega!");
        	// TODO: handle exception
		}
		return false;
       
	
	}

}
