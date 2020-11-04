package br.com.imobiliariaestacio.sql;

public class SQLUtil {

	public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/bancoImobiliaria";
    public static String USUARIO_POSTGRES = "postgres";
    public static String SENHA_POSTGRES = "Rildo@123";
	public final static String COLUNA_ID = "id";

    //Endereço
	
	public static class EnderecoSQL{
		public final static String NAME_TABLE = "endereco";
		public final static String COLUNA_RUA = "rua";
		public final static String COLUNA_CEP = "cep";
		public final static String COLUNA_NUMERO = "numero";
		public final static String COLUNA_BAIRRO = "bairro";
		public final static String COLUNA_CIDADE = "cidade";
		public final static String COLUNA_ESTADO = "estado";

	
		public static final String INSERT_ENDERECO = "insert into " + NAME_TABLE + 
				"(" + COLUNA_RUA + "," + COLUNA_NUMERO + "," + COLUNA_BAIRRO + ", " + COLUNA_CEP +
				", " + COLUNA_CIDADE + "," + COLUNA_ESTADO + ") VALUES (?,?,?,?,?,?) returning id_endereco";
		
		public static final String UPDATE_ENDERECO = "update " + NAME_TABLE +
				" set " + COLUNA_RUA + "=?, " + COLUNA_CEP + "=?, " + COLUNA_NUMERO + "=?, " + COLUNA_NUMERO  + "=?, " + 
						  COLUNA_BAIRRO  + "=?, " + COLUNA_CIDADE  + "=?, " + COLUNA_ESTADO  + "=?, where id=? ";
	
		public static final String DELETE_ENDERECO = "delete from " + NAME_TABLE + "where id = ?";
	}

	//FUNCIONARIO
	
	public static class FuncionarioSQL{

		public static final String INSERT_FUNCIONARIO = "insert into funcionario ( nome, sobrenome, cpf, rg, login, senha) VALUES (?,?,?,?,?,?) returning id";
		
		public static final String SELECT_CPF_FUNCIONARIO = "SELECT cpf FROM funcionario where cpf = (?)";	
		
		public static final String SELECT_LOGIN_E_SENHA_FUNCIONARIO = "SELECT * FROM funcionario where login = (?) and senha = (?)";

		public static final String SELECT_LOGIN_FUNCIONARIO = "SELECT login FROM funcionario where login = (?)";

	
	}
	
	
	
	//IMOVEL
	public static class ImovelSQL{
		public final static String INSERT_IMOVEL = "insert into imovel (tipo, valor, status, area, codigo, id_endereco) values (?,?,?,?,?,?) returning id";

		public static final String SELECT_IMOVEL = "SELECT * FROM imovel where tipo = (?), valor = (?), status = (?), area = (?), codigo = (?)";
	}
	

	
	
	//PROPRIETARIO
	public static class ProprietarioSQL{
		public final static String INSERT_PROPRIETARIO = "insert into proprietario (nome, sobrenome, cpf, rg, id_endereco) values (?,?,?,?,?) returning id";
	
		public static final String SELECT_CPF_PROPRIETARIO = "SELECT cpf FROM proprietario where cpf = (?)";	

		
	}
	
}
