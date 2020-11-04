package br.com.imobiliariaestacio.business;

import java.util.ArrayList;

import br.com.imobiliariaestacio.model.Endereco;

public interface IBusinessEndereco {
	
	public Endereco salvar(Endereco endereco) throws Exception;
	public ArrayList<Endereco> listarTodosEndereco() throws Exception;
	public Endereco editar(Endereco endereco) throws Exception;

}
