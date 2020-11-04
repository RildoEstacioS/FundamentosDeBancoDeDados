package br.com.imobiliariaestacio.model;

/**
 * @author RildoEstacio
 *
 */
public class Funcionario extends Usuario{

	private int id;
	private String login, senha;

	public Funcionario() {
		
	}
	
	public Funcionario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public Funcionario(String cpf) {
		super(cpf);
	}
	
	public Funcionario(int id, String nome, String sobrenome, String cargo, String rg, String cpf,
			String login, String senha) {
		super(id, nome, sobrenome, rg, cpf);
		this.login = login;
		this.senha = senha;
	}

	public Funcionario(String nome, String sobrenome, String rg, String cpf, String login, String senha) {
		super(nome, sobrenome, rg, cpf);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", login=" + login + ", senha=" + senha + "]";
	}


	
	
	
	
	
}
