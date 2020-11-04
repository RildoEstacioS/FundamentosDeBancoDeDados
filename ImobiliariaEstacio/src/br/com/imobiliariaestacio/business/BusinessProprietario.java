package br.com.imobiliariaestacio.business;

import br.com.imobiliariaestacio.dao.DaoProprietario;
import br.com.imobiliariaestacio.dao.IDaoProprietario;
import br.com.imobiliariaestacio.model.Proprietario;

public class BusinessProprietario implements IBusinessProprietario{

	public IDaoProprietario daoProprietario;
	
	
	
	public BusinessProprietario() {
		super();
		daoProprietario = new DaoProprietario();
	}



	@Override
	public Proprietario salvarProprietario(Proprietario proprietario) throws Exception {
		// TODO Auto-generated method stub
		return daoProprietario.salvarProprietario(proprietario) ;
	}



	@Override
	public boolean buscarProprietarioCpf(String cpf) throws Exception {
		// TODO Auto-generated method stub
		return daoProprietario.buscarProprietarioCpf(cpf);
	}

}
