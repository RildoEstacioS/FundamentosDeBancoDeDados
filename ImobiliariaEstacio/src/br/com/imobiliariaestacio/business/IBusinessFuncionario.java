package br.com.imobiliariaestacio.business;

import java.util.ArrayList;

import br.com.imobiliariaestacio.model.Funcionario;

public interface IBusinessFuncionario {

	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception;
	public ArrayList<Funcionario> listarFuncionarios() throws Exception;
	public Funcionario updateFuncionario(Funcionario funcionario) throws Exception;
	public void deleteFuncionario (Funcionario funcionario) throws Exception;
	public boolean buscarFuncionarioCpf(String cpf)throws Exception; 
	public Funcionario funcionarioLogin(String login, String senha)throws Exception; 
	public boolean buscarLoginFuncionario(String login)throws Exception; 


}
