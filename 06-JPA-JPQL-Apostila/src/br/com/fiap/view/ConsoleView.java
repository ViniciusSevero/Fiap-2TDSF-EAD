package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleView {

	public static void main(String[] args) {
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAOImpl dao  = new PacoteDAOImpl(manager);
		
		List<Pacote> pacotes = dao.listar();
		for (Pacote pacote : pacotes) {
			System.out.println(pacote);
		}
		manager.close();
	}

}
