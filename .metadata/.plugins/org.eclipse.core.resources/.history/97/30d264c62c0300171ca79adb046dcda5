package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_GRUPO_AM")
@SequenceGenerator(name="SEQ_GRUPO_AM",sequenceName="SEQ_GRUPO_AM",allocationSize=1)
public class Grupo {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_GRUPO_AM")
	@Column(name="CD_GRUPO")
	private int codigo;
	
	@OneToOne(mappedBy="grupo",cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
	private Projeto projeto; 
	
	@Column(name="NM_GRUPO",nullable=false,length=150)
	private String nome;
	
	@OneToMany(mappedBy="grupo")
	private List<Aluno> alunos;

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
	

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	@Override
	public String toString() {
		return "Grupo [codigo=" + codigo + ", nome=" + nome + "]";
	}
}
