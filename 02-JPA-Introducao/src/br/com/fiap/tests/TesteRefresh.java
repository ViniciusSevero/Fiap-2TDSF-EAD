package br.com.fiap.tests;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Aluno;

public class TesteRefresh {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno = manager.find(Aluno.class, 1);
		
		System.out.println(aluno.getNome());
		
		aluno.setNome("Juli�o");
		
		System.out.println(aluno.getNome());
		
		manager.refresh(aluno);
		
		System.out.println(aluno.getNome());
		
		manager.close();
		factory.close();
	}

}
