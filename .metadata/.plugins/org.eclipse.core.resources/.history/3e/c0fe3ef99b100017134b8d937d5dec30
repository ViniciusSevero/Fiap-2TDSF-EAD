package br.com.fiap.view;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.ReservaDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;
import br.com.fiap.exception.IdNotFoundException;

public class ConsoleViewCliente {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IdNotFoundException {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		ReservaDAO daoReserva = new ReservaDAOImpl(em);
		TransporteDAO daoTransporte = new TransporteDAOImpl(em);
		PacoteDAO daoPacote = new PacoteDAOImpl(em);
		
		List<Cliente> all = dao.listar();
		for (Cliente cliente : all) {
			System.out.println(cliente.getNome());
		}
		
		List<Cliente> sp = dao.buscarPoEstado("SP");
		for (Cliente cliente : sp) {
			System.out.println(cliente.getNome() + " | " + cliente.getEndereco().getCidade().getUf());
		}
		
		List<Cliente> nrDias = daoReserva.buscarPorDias((int)Math.random() * 10);
		for (Cliente cliente : nrDias) {
			System.out.println(cliente.getNome());
		}
		
		System.out.println("ID transporte: ");
		Transporte t = daoTransporte.pesquisar(scanner.nextInt());
		if(t == null){
			throw new IdNotFoundException("Id transporte inválido");
		}
		List<Pacote> pacotes = daoPacote.buscarPorTransporte(t);
		for (Pacote pacote : pacotes) {
			System.out.println(pacote.getDescricao());
		}
		
		em.close();
		System.exit(0);
	}

}
