package br.com.fiap.view;


import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleView1 {
	public static void main(String[] args) {
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao  = new ClienteDAOImpl(manager);
		
		Cliente c = dao.getClientePorCpf("46476561871");
		
		System.out.println(c);
		
		manager.close();
	}
}