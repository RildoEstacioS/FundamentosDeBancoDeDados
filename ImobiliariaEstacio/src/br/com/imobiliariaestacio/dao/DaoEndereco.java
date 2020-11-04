package br.com.imobiliariaestacio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.imobiliariaestacio.model.Endereco;
import br.com.imobiliariaestacio.sql.ConnectionFactory;
import br.com.imobiliariaestacio.sql.SQLUtil;
import br.com.imobiliariaestacio.view.Mensagem;
import br.com.imobiliariaestacio.view.TelaUsuario;



public class DaoEndereco implements IDaoEndereco{

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;	
	private Endereco endereco;
	
	public static int chaveEstrangeiraProprietario;
	public static int chaveEstrangeiraImovel;

	@Override
	public Endereco salvar(Endereco endereco) throws Exception {

	    try {
	    	conexao = ConnectionFactory.getConnection();
	    	
	    	this.statement = conexao.prepareStatement(SQLUtil.EnderecoSQL.INSERT_ENDERECO);
	    	this.statement.setString(1, endereco.getRua());
	    	this.statement.setString(2, endereco.getNumero());
	    	this.statement.setString(3, endereco.getBairro());
	    	this.statement.setString(4, endereco.getCep());
	    	this.statement.setString(5, endereco.getCidade());
	    	this.statement.setString(6, endereco.getEstado());
	    	
	    	this.result = statement.executeQuery();
	    	this.result.next();
	    	endereco.setId(result.getInt(1));
	   
	    	System.out.println(result.getInt(1));

	    	chaveEstrangeiraImovel = result.getInt(1);
	    	chaveEstrangeiraProprietario = result.getInt(1);
    	
	    	this.statement.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco;
	}

	@Override
	public ArrayList<Endereco> listarTodosEndereco() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco editar(Endereco endereco) throws Exception {
	    try {
	    	conexao = ConnectionFactory.getConnection();
	    	
	    	this.statement = conexao.prepareStatement(SQLUtil.EnderecoSQL.UPDATE_ENDERECO);
	    	this.statement.setString(1, endereco.getRua());
	    	this.statement.setString(2, endereco.getNumero());
	    	this.statement.setString(3, endereco.getBairro());
	    	this.statement.setString(4, endereco.getCep());
	    	this.statement.setString(5, endereco.getCidade());
	    	this.statement.setString(6, endereco.getEstado());
	    	
	    	this.statement.setInt(8, endereco.getId());
	    	
	    	this.statement.execute();
	    	this.statement.close();
//	    	this.result.next();
//	    	endereco.setId(result.getInt(1));
	    	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return endereco;	}
	
}
