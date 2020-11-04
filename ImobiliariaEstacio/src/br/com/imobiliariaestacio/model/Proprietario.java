package br.com.imobiliariaestacio.model;

public class Proprietario {

	private int id;
	private String rg, cpf, nome, sobrenome;
	private int id_endereco;

	public Proprietario(String rg, String cpf, String nome, String sobrenome, int id_endereco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.rg = rg;
		this.id_endereco = id_endereco;
	}

	public Proprietario(String rg, String cpf, String nome, String sobrenome) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}



	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(int id_endereco) {
		this.id_endereco = id_endereco;
	}
	
	
	
}
