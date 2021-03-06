package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.beans.Livro;

public class LivroDAO implements BasicCRUD<Livro> {
	private EntityManager manager;
	
	public LivroDAO(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public void cadastrar(Livro o) {
		this.manager.persist(o);
		
	}

	@Override
	public Livro buscar(int key) {
		// TODO Auto-generated method stub
		return this.manager.find(Livro.class, key);
	}

	@Override
	public void remover(Livro o) {
		this.manager.remove(o);
		
	}

	@Override
	public List<Livro> buscarTodos() {
		TypedQuery<Livro> query = this.manager.createQuery("select x from Livro x",Livro.class);
 		return query.getResultList();
	}

	@Override
	public void alterar(Livro o) {
		this.manager.merge(o);
		
	}

	
	
}
