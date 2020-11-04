package br.com.imobiliariaestacio.business;

import br.com.imobiliariaestacio.dao.DaoImovel;
import br.com.imobiliariaestacio.dao.IDaoFuncionario;
import br.com.imobiliariaestacio.dao.IDaoImovel;
import br.com.imobiliariaestacio.model.Imovel;

public class BusinessImovel implements IBusinessImovel{

	private IDaoImovel daoImovel;
	
	public BusinessImovel() {
		super();
		daoImovel = new DaoImovel();
	}



	@Override
	public Imovel salvarImovel(Imovel imovel) throws Exception {
		return daoImovel.salvarImovel(imovel);
	}

}
