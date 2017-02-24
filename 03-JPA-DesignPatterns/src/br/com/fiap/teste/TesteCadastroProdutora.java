package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ProdutoraDAO;
import br.com.fiap.dao.ProdutoraDAOImpl;
import br.com.fiap.entity.Produtora;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteCadastroProdutora {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		ProdutoraDAO dao = new ProdutoraDAOImpl(manager);
		dao.cadastrar(new Produtora(0,"Ubisoft"));
		try {
			dao.salvar();
		} catch (CommitErrorException e) {
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}

	}

}
