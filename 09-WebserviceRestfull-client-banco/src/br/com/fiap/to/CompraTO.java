package br.com.fiap.to;

public class CompraTO {
	private int codigo;
	
	private String descricao;
	
	private double valor;
	
	public CompraTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CompraTO(int codigo, String descricao, double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
