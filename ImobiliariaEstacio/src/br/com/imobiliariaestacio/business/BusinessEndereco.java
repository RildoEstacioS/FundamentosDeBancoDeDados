package br.com.imobiliariaestacio.business;

import java.util.ArrayList;

import br.com.imobiliariaestacio.dao.DaoEndereco;
import br.com.imobiliariaestacio.dao.IDaoEndereco;
import br.com.imobiliariaestacio.model.Endereco;

public class BusinessEndereco implements IBusinessEndereco {
	
	private IDaoEndereco daoEndereco;

	public BusinessEndereco() {
		daoEndereco = new DaoEndereco();
	}

	
	@Override
	public Endereco salvar(Endereco endereco) throws Exception {
		// TODO Auto-generated method stub
		return daoEndereco.salvar(endereco);
	}

	@Override
	public ArrayList<Endereco> listarTodosEndereco() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Endereco editar(Endereco endereco) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
