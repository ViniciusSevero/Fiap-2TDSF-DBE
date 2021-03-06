package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_COMPRA")
@SequenceGenerator(name="SEQ_COMPRA",sequenceName="SEQ_COMPRA",allocationSize=1)
public class Compra {
	@Id @GeneratedValue(generator="SEQ_COMPRA",strategy=GenerationType.SEQUENCE)
	@Column(name="CD_COMPRA")
	private int codigo;
	
	@Column(name="DS_COMPRA")
	private String descricao;
	
	@Column(name="VL_COMPRA")
	private double valor;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
	
	public Compra(int codigo, String descricao, double valor) {
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
