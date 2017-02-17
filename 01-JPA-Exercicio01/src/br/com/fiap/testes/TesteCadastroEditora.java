package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Editora;

public class TesteCadastroEditora {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		try{
			manager.persist(new Editora(0, "123456789", "Ática", "Rua do Jacare 375"));
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
