package br.com.imobiliariaestacio.facade;

import java.util.ArrayList;

import br.com.imobiliariaestacio.model.Endereco;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.model.Imovel;
import br.com.imobiliariaestacio.model.Proprietario;

public interface IFacade {

	//Endereço
	
	public Endereco salvarEndereco(Endereco endereco) throws Exception;
	public ArrayList<Endereco> listarTodosEndereco() throws Exception;
	public Endereco editarEndereco(Endereco endereco) throws Exception;
	
	//Funcionario

	public Funcionario salvarFuncionario(Funcionario usuario) throws Exception;

	
	public boolean buscarFuncionarioCpf(String cpf)throws Exception; 
	public Funcionario funcionarioLogin(String login, String senha)throws Exception; 
	public boolean buscarLoginFuncionario(String login)throws Exception; 

	//Imovel
	public Imovel salvarImovel(Imovel imovel)throws Exception; 
	
	//Proprietario
	
	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception;
	public boolean buscarProprietarioCpf(String cpf)throws Exception; 
	
}
