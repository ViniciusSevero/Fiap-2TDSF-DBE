package br.com.fiap.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.exception.CodigoInvalidoException;
import br.com.fiap.exception.CommitErrorException;

public class GenericDAOImpl<T,K> implements GenericDAO<T, K> {

	private EntityManager manager;
	private Class<T> clazz;
	
	public GenericDAOImpl(EntityManager manager) {
		this.manager = manager;
		//GenericDAOImpl < GenericDAO (getGenericSuperClass)
		//pegar o tipo do parametro 0 (T) dessa classe
		clazz = (Class<T>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@Override
	public void cadastrar(T entidade) {
		manager.persist(entidade);	
	}

	@Override
	public void atualizar(T entidade) {
		manager.merge(entidade);	
		
	}

	@Override
	public void excluir(K codigo) throws CodigoInvalidoException {
		T entidade = manager.find(clazz, codigo);
		if(entidade == null){
			throw new CodigoInvalidoException("Entity not found");
		}
		manager.remove(entidade);	
	}

	@Override
	public T buscar(K codigo) {
		T entidade = manager.find(clazz, codigo);
		return entidade;
	}

	@Override
	public void salvar() throws CommitErrorException {
		try{
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		}catch(Exception e){
			if(manager.getTransaction().isActive()){
				manager.getTransaction().rollback();
			}
			throw new CommitErrorException("Erro");
		}
	}
	
}
