package br.com.fiap.view;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ConsoleViewAniversario {

	private static Scanner entrada = new Scanner(System.in);
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		EntityManager manager = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(manager);
		
		System.out.println("n�mero do m�s");
		int mes = entrada.nextInt();
		
		List<Cliente> clietnes = dao.buscarPorAniversario(mes);
		for (Cliente cliente : clietnes) {
			System.out.println(cliente.getNome() + " - " + sdf.format(cliente.getDataNascimento().getTime()));
		}
		
		manager.close();
		System.exit(0);
		
		

	}

}
