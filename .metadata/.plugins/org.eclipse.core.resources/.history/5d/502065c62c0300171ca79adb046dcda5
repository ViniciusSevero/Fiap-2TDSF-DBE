package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_PROJETO_AM")
@SequenceGenerator(name="SEQ_PROJETO_AM",sequenceName="SEQ_PROJETO_AM",allocationSize=1)
public class Projeto {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_PROJETO_AM")
	@Column(name="CD_PROJETO")
	private int codigo;
	
	@Column(length=100,nullable=false,name="DS_TEMA")
	private String tema;
	
	@Column(name="DS_OBJETIVO")
	private String objetivo;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_INICIO",nullable=false)
	private Calendar dtInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_TERMINO")
	private Calendar dtTermino;
	
	@OneToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="FK_CD_GRUPO")
	private Grupo grupo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	public Calendar getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Calendar dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Calendar getDtTermino() {
		return dtTermino;
	}
	public void setDtTermino(Calendar dtTermino) {
		this.dtTermino = dtTermino;
	}
		
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Projeto [codigo=" + codigo + ", tema=" + tema + ", objetivo=" + objetivo + ", dtInicio=" + dtInicio
				+ ", dtTermino=" + dtTermino + "]";
	}
	
	
	
}
