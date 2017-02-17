package br.com.fiap.testes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.beans.Autor;
import br.com.fiap.beans.Sexo;

public class TesteCadastroAutor {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		try{
			manager.persist(new Autor(0,"Vinicius",Sexo.MASCULINO,"Severo",Calendar.getInstance()));
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
