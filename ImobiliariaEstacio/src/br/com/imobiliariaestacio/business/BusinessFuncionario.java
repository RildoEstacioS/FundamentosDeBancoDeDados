package br.com.imobiliariaestacio.business;

import java.util.ArrayList;

import br.com.imobiliariaestacio.dao.DaoFuncionario;
import br.com.imobiliariaestacio.dao.IDaoEndereco;
import br.com.imobiliariaestacio.dao.IDaoFuncionario;
import br.com.imobiliariaestacio.model.Funcionario;

public class BusinessFuncionario implements IBusinessFuncionario{
	
	private IDaoFuncionario daoFuncionario;
	
	public BusinessFuncionario(){
		daoFuncionario = new DaoFuncionario();		
	}

	@Override
	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception {
		// TODO Auto-generated method stub
		return daoFuncionario.salvarFuncionario(funcionario);
	}
	
	@Override
	public boolean buscarFuncionarioCpf(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return daoFuncionario.buscarFuncionarioCpf(cpf);
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
	public void deleteFuncionario(Funcionario funcionario) {
	// TODO Auto-generated method stub
	
	}

	@Override
	public Funcionario funcionarioLogin(String login, String senha) throws Exception {
		
		return daoFuncionario.funcionarioLogin(login, senha);
	}

//	public boolean funcionarioLogin(String login, String senha) throws Exception {
//		
//		return daoFuncionario.funcionarioLogin(login, senha);
//	}

	@Override
	public boolean buscarLoginFuncionario(String login) throws Exception {
		// TODO Auto-generated method stub
		return daoFuncionario.buscarLoginFuncionario(login);
	}
	
	
	
}
