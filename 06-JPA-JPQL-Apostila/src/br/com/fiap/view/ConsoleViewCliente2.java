package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.IdNotFoundException;

public class ConsoleViewCliente2 {

	public static void main(String[] args) throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		List<String> estados = new ArrayList<>();
		estados.add("SP");
		estados.add("RJ");
		estados.add("MG");
		List<Cliente> clientes = dao.buscarPorEstados(estados);
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome() + " - " + cliente.getEndereco().getCidade().getUf());
		}
		
		em.close();
		System.exit(0);
	}

}
