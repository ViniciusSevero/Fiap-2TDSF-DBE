package br.com.fiap.biblioteca.dao;

import java.util.List;

import br.com.fiap.biblioteca.beans.Livro;

public interface LIvroDao {
	void cadastrar(Livro livro);
	void deletar(long id);
	void editar(Livro livro);
	Livro buscar(long id);
	List<Livro> listar();
}
