package br.com.imobiliariaestacio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.sql.ConnectionFactory;
import br.com.imobiliariaestacio.sql.SQLUtil;
import br.com.imobiliariaestacio.view.Mensagem;

public class DaoFuncionario implements IDaoFuncionario{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;	
	

	@Override
	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception {


	    try {
	    	conexao = ConnectionFactory.getConnection();
	    	
	    	this.statement = conexao.prepareStatement(SQLUtil.FuncionarioSQL.INSERT_FUNCIONARIO);
	    	this.statement.setString(1, funcionario.getNome());
	    	this.statement.setString(2, funcionario.getSobrenome());
	    	this.statement.setString(3, funcionario.getCpf());
	    	this.statement.setString(4, funcionario.getRg());
	    	this.statement.setString(5, funcionario.getLogin());
	    	this.statement.setString(6, funcionario.getSenha());
	    	
	    	this.result = statement.executeQuery();
	    	this.result.next();
	    	funcionario.setId(result.getInt(1));
	    	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}

	public boolean buscarFuncionarioCpf(String cpf) throws Exception{

        
        try {
	    	conexao = ConnectionFactory.getConnection();

            this.statement = conexao.prepareStatement(SQLUtil.FuncionarioSQL.SELECT_CPF_FUNCIONARIO);
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

	public Funcionario funcionarioLogin(String login, String senha) throws Exception{


    	conexao = ConnectionFactory.getConnection();
    	
    	Funcionario funcionario ;
    	

		   try {
	            this.statement = conexao.prepareStatement(SQLUtil.FuncionarioSQL.SELECT_LOGIN_E_SENHA_FUNCIONARIO);
	            this.statement.setString(1, login);
	            this.statement.setString(2, senha);
			   	this.result = statement.executeQuery();
			   	
			   	
	            if(result.next()){
	            	if (result.getString(6).equals(login) && result.getString(7).equals(senha)) {
	            		funcionario = new Funcionario(result.getString(6), result.getString(7));
	            		funcionario.setLogin(result.getString(6));
	            		funcionario.setSenha(result.getString(7));
	            		return funcionario;	            		
	            	}
	            }
		   }catch (SQLException e) {
			   System.out.println("Entrando no catch");
			   e.printStackTrace();
			   return null;
            }
            return null;
	}
	
	
	public boolean buscarLoginFuncionario(String login) throws Exception {
		
		conexao = ConnectionFactory.getConnection();


		   try {
	            this.statement = conexao.prepareStatement(SQLUtil.FuncionarioSQL.SELECT_LOGIN_FUNCIONARIO);
	            this.statement.setString(1, login);
			   	this.result = statement.executeQuery();
			   	this.result.next();
			   	
	            if(result.next()){
	            	if (result.getString(1).equals(login)) {
	            		return true;	            		
	            	}
	            }
		   }catch (SQLException e) {
         	e.printStackTrace();
         	System.err.println("Entrando no catch");
         	return false;
         }
         return false;
		
	}
	
	@Override
	public ArrayList<Funcionario> listarFuncionarios() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Funcionario updateFuncionario(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void deleteFuncionario(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		
	}
}