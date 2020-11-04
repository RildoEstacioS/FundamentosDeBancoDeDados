package br.com.imobiliariaestacio.business;

import br.com.imobiliariaestacio.model.Proprietario;

public interface IBusinessProprietario {
	
	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception;
	public boolean buscarProprietarioCpf(String cpf)throws Exception; 


}
