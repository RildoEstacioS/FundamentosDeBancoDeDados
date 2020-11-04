package br.com.imobiliariaestacio.model;

public class Usuario {
	private int id;
	private String nome, sobrenome, rg, cpf;

	public Usuario(){
	}
	
	public Usuario(int id, String nome, String sobrenome, String rg, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public Usuario(String nome, String sobrenome, String rg, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public Usuario(String cpf) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
