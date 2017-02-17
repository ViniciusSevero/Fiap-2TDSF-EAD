package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Livro;

public class TesteCadastroLivro {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		try{
			manager.persist(new Livro(0, "Gal�xias Distantes", 50, Calendar.getInstance(), new byte[1024]));
			manager.getTransaction().commit();
		}catch(Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}

	}
}
