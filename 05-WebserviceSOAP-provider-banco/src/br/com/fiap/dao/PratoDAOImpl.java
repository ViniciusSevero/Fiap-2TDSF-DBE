package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Prato;

public class PratoDAOImpl extends GenericDAOImpl<Prato, Integer> implements PratoDAO {

	public PratoDAOImpl(EntityManager manager) {
		super(manager);
	}

}
