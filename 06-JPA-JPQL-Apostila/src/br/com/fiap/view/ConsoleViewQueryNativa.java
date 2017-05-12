package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class ConsoleViewQueryNativa {

	public static void main(String[] args) {
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(manager);
		
		List<Transporte> transportes = dao.buscarPorEmpresa("a");
		for (Transporte transporte : transportes) {
			System.out.println(transporte);
		}
		manager.close();
		System.exit(0);
	}

}
