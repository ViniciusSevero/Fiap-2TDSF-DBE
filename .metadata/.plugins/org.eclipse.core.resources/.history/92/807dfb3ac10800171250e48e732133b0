package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRATO")
@SequenceGenerator(name="SEQ_PRATO",sequenceName="SEQ_PRATO",allocationSize=1)
public class Prato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_PRATO")
	@Column(name="NR_CODIGO")
	private int codigo;
	
	@Column(name="NM_PRATO",nullable=false)
	private String nome;
	
	@Column(name="DS_PRATO")
	private String descricao;
	
	@Column(name="VL_PRECO")
	private float preco;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Prato [codigo=" + codigo + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
}
