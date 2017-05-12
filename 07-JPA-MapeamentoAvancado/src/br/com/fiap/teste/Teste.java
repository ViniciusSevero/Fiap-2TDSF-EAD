package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.AluguelDAOImpl;
import br.com.fiap.entity.Automovel;
import br.com.fiap.entity.Cliente;

public class Teste {

	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		AluguelDAO dao = new AluguelDAOImpl(em);
		
		Cliente c = new Cliente();
		c.setNome("Vinicius");
		
		Automovel a = new Automovel();
		a.setMarca("Renault");
		a.setModelo("Fluence");
		
		Aluguel aluguel = new Aluguel();
		aluguel.setCliente(c);
		aluguel.setAutomovel(a);
		aluguel.setDtAluguel(Calendar.getInstance());
		aluguel.setDtRetorno(new GregorianCalendar(2017,1,1));
		aluguel.setVlAluguel(1500.00);
		
		try{
			dao.cadastrar(aluguel);
			dao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		

	}

}
