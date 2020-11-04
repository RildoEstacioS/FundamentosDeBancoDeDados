package br.com.imobiliariaestacio.model;

public class Imovel {

	private int id;
	
	private String tipo, status, area;
	private int valor;
	private int codigoImovel;
	private int id_endereco;

	public Imovel(String tipo, int valor, String status, String area, int codigoImovel, int id_endereco) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.status = status;
		this.area = area;
		this.codigoImovel = codigoImovel;
		this.id_endereco = id_endereco;
	}

	public Imovel(int id, String tipo, int valor, String status, String area, int codigoImovel, int id_endereco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.valor = valor;
		this.status = status;
		this.area = area;
		this.codigoImovel = codigoImovel;
		this.id_endereco = id_endereco;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		this.valor = valor;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getCodigoImovel() {
		return codigoImovel;
	}


	public void setCodigoImovel(int codigoImovel) {
		this.codigoImovel = codigoImovel;
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
