package br.com.fiap.dao;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Disciplina;

public class DisciplinaDAO extends GenericDAOImpl<Disciplina, Integer> implements GenericDAO<Disciplina, Integer> {

	public DisciplinaDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

}
