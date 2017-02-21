package br.com.fiap.beans;

import java.io.Serializable;

public class ProdutoTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int codigo;
	private String titulo;
	private double precoUnitario;
	private int qtdeEstoque;
	
	public ProdutoTO() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoTO(int codigo, String titulo, Double precoUnitario, int qtdeEstoque) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.precoUnitario = precoUnitario;
		this.qtdeEstoque = qtdeEstoque;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
