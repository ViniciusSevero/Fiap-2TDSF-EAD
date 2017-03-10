package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Time;

public class TimeDAO extends GenericDAOImpl<Time, Integer> implements GenericDAO<Time, Integer> {

	public TimeDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

}
