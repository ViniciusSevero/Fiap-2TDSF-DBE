package br.com.fiap.beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Livro extends Produto{
	private String autor;
	private String editora;
	private Calendar dtLancamento;
	
	public Livro(int codigo, String titulo, double preco, String autor, String editora, Calendar dtLancamento) {
		super(codigo, titulo, preco);
		this.autor = autor;
		this.editora = editora;
		this.dtLancamento = dtLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Calendar getDtLancamento() {
		return dtLancamento;
	}
	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}
	@Override
	public String toString() {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return  super.toString() + "Livro [autor=" + autor + ", editora=" + editora + ", dtLancamento=" +  format.format(dtLancamento.getTime()) + ", getCodigo()="
				+ getCodigo() + ", getTitulo()=" + getTitulo() + ", getPreco()=" + getPreco() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
