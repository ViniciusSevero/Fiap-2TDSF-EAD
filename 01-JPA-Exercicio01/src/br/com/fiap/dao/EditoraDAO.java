package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.beans.Editora;

public class EditoraDAO implements BasicCRUD<Editora> {

	private EntityManager manager;
	
	public EditoraDAO(EntityManager manager) {
		this.manager = manager;
	}
	
	@Override
	public void cadastrar(Editora o) {
		this.manager.persist(o);
		
	}

	@Override
	public Editora buscar(int key) {
		// TODO Auto-generated method stub
		return this.manager.find(Editora.class, key);
	}

	@Override
	public void remover(Editora o) {
		this.manager.remove(o);
		
	}

	@Override
	public List<Editora> buscarTodos() {
		Query query = this.manager.createQuery("select x from Editora x");
		return query.getResultList();
	}

	@Override
	public void alterar(Editora o) {
		this.manager.merge(o);
		
	}
	
}
