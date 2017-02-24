package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ProdutoraDAO;
import br.com.fiap.dao.ProdutoraDAOImpl;
import br.com.fiap.entity.Produtora;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteBuscaProdutora {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		ProdutoraDAO dao = new ProdutoraDAOImpl(manager);
		Produtora produtora = dao.buscar(1);
		System.out.println(produtora);
		manager.close();
		factory.close();
	}

}
