package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Compra;

public class CompraDAO extends GenericDAOImpl<Compra, Integer> implements GenericDAO<Compra, Integer>{

	public CompraDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}
	
	public List<Compra> listar(){
		return this.manager.createQuery("select x from Compra x").getResultList();
	}
	
}
