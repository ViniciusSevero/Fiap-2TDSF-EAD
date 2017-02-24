package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Produtora;

public class ProdutoraDAOImpl extends GenericDAOImpl<Produtora, Integer> implements ProdutoraDAO {

	public ProdutoraDAOImpl(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}
	
}
