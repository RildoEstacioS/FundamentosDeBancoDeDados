package br.com.imobiliariaestacio.dao;

import br.com.imobiliariaestacio.model.Proprietario;

public interface IDaoProprietario {

	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception;
	public boolean buscarProprietarioCpf(String cpf)throws Exception; 

	
}
