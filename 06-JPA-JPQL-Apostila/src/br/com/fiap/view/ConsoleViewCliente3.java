package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleViewCliente3 {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAOImpl dao = new ClienteDAOImpl(em);
		List<Cliente> lista = dao.buscarPorNome("a");
		for (Cliente cliente : lista) {
			System.out.println(cliente.getNome());
		}
		em.close();
		System.exit(0);

	}

}
