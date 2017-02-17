package br.com.fiap.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Livro;
import br.com.fiap.dao.LivroDAO;

public class TesteLivroSelect {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		List<Livro> livros = new LivroDAO(manager).buscarTodos();
		for (Livro livro : livros) {
			System.out.println(livro);
		}

	}

}
