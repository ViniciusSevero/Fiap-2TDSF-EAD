package br.com.fiap.view;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class ConsoleViewPrecoMaximo {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		PacoteDAOImpl dao = new PacoteDAOImpl(manager);
		System.out.println("Digite o pre�o m�ximo");
		float preco = scanner.nextFloat();
		List<Pacote> pacotes = dao.buscarPorPrecoMaximo(preco);
		for (Pacote pacote : pacotes) {
			System.out.println(pacote);
		}
		manager.close();
		System.exit(0);
	}

}
