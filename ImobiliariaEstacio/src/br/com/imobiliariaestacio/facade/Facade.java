package br.com.imobiliariaestacio.facade;

import java.util.ArrayList;

import br.com.imobiliariaestacio.business.BusinessEndereco;
import br.com.imobiliariaestacio.business.BusinessFuncionario;
import br.com.imobiliariaestacio.business.BusinessImovel;
import br.com.imobiliariaestacio.business.BusinessProprietario;
import br.com.imobiliariaestacio.business.IBusinessEndereco;
import br.com.imobiliariaestacio.business.IBusinessFuncionario;
import br.com.imobiliariaestacio.business.IBusinessImovel;
import br.com.imobiliariaestacio.business.IBusinessProprietario;
import br.com.imobiliariaestacio.model.Endereco;
import br.com.imobiliariaestacio.model.Funcionario;
import br.com.imobiliariaestacio.model.Imovel;
import br.com.imobiliariaestacio.model.Proprietario;

public class Facade implements IFacade{
	
	public static Facade instance;

	public IBusinessEndereco businessEndereco;
	public IBusinessFuncionario businessFuncionario;
	public IBusinessImovel businessImovel;
	public IBusinessProprietario businessProprietario;
	
	public Facade(){
		businessEndereco = new BusinessEndereco();
		businessFuncionario = new BusinessFuncionario();
		businessImovel = new BusinessImovel();
		businessProprietario = new BusinessProprietario();
	}
	
	public static Facade getInstance(){
		if (instance == null) 
			instance = new Facade();
		return instance;
	}
	
	//ENDEREÇO
	
	@Override
	public Endereco salvarEndereco(Endereco endereco) throws Exception{
		// TODO Auto-generated method stub
		return businessEndereco.salvar(endereco);
	}

	@Override
	public ArrayList<Endereco> listarTodosEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco editarEndereco(Endereco endereco){
		// TODO Auto-generated method stub
		return null;
	}

	
	//FUNCIONARIO   
	
	
	@Override
	public Funcionario salvarFuncionario(Funcionario funcionario) throws Exception {
		System.out.println("Chegou aqui!!!");
		return businessFuncionario.salvarFuncionario(funcionario);
	}

	@Override
	public boolean buscarFuncionarioCpf(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return businessFuncionario.buscarFuncionarioCpf(cpf);
	}
	
	public Funcionario funcionarioLogin (String login, String senha) throws Exception{
		return businessFuncionario.funcionarioLogin(login, senha);
	}


	@Override
	public boolean buscarLoginFuncionario(String login) throws Exception {
		// TODO Auto-generated method stub
		return businessFuncionario.buscarLoginFuncionario(login);
	}

	
	//IMOVEL
	
	@Override
	public Imovel salvarImovel(Imovel imovel) throws Exception {
		// TODO Auto-generated method stub
		return businessImovel.salvarImovel(imovel);
	}

	//PROPRIETARIO
	
	@Override
	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception {
		// TODO Auto-generated method stub
		return businessProprietario.salvarProprietario(proprietario);
	}

	@Override
	public boolean buscarProprietarioCpf(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return businessProprietario.buscarProprietarioCpf(cpf);
	}


	
	
	
	
	
	
}
