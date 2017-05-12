package br.com.fiap.entity;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.impl.GenericDAOImpl;

public class AluguelDAOImpl extends GenericDAOImpl<Aluguel, AluguelPK> implements AluguelDAO {

	public AluguelDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
