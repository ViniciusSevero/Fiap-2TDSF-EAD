package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.beans.Autor;

public class AutorDAO implements BasicCRUD<Autor>{

	private EntityManager manager;
	
	public AutorDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	@Override
	public void cadastrar(Autor o) {
		this.manager.persist(o);
	}

	@Override
	public Autor buscar(int key) {
		return this.manager.find(Autor.class, key);
	}

	@Override
	public void remover(Autor o) {
		this.manager.remove(o);
		
	}

	@Override
	public List<Autor> buscarTodos() {
		Query query = this.manager.createQuery("select x from Autor x");
		return query.getResultList();
		
	}

	@Override
	public void alterar(Autor o) {
		this.manager.merge(o);
	}

}
