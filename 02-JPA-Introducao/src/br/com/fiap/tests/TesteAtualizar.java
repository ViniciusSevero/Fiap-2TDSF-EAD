package br.com.fiap.tests;

import javax.naming.ldap.ManageReferralControl;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Aluno;

public class TesteAtualizar {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno = manager.find(Aluno.class, 1);
		
		manager.getTransaction().begin();;
		
		aluno.setNome("Vinicius P. Severo");
		manager.merge(aluno);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}		
}
