package br.com.imobiliariaestacio.model;

public class Endereco {

	private int id;
	private String rua, cidade, estado, cep, bairro, numero;


	
	public Endereco(String rua, String cidade, String estado, String cep, String bairro, String numero) {
		super();
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.bairro = bairro;
		this.numero = numero;
	}

	public Endereco(int id, String rua, String cidade, String estado, String cep, String bairro, String numero) {
		super();
		this.id = id;
		this.numero = numero;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.bairro = bairro;
	}



	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}

