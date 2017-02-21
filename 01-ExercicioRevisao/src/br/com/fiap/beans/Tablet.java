package br.com.fiap.beans;

public class Tablet extends Produto implements Eletronicos{
	private String modelo;
	private String marca;
	private String sistemaOperacional;
	private boolean is3g;
	
	public Tablet(int codigo, String titulo, double preco, String modelo, String marca, String sistemaOperacional,
			boolean is3g) {
		super(codigo, titulo, preco);
		this.modelo = modelo;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.is3g = is3g;
	}

	public Tablet() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	public boolean isIs3g() {
		return is3g;
	}

	public void setIs3g(boolean is3g) {
		this.is3g = is3g;
	}

	@Override
	public double calcularGarantiaEstendida() {
		return this.getPreco() * 0.05;
	}

	@Override
	public String toString() {
		return super.toString() + "Tablet [modelo=" + modelo + ", marca=" + marca + ", sistemaOperacional=" + sistemaOperacional
				+ ", is3g=" + is3g + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo() + ", getPreco()="
				+ getPreco() + "Valor gfarantia Estendida R$ " + calcularGarantiaEstendida() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	
	
	
	
	
}
