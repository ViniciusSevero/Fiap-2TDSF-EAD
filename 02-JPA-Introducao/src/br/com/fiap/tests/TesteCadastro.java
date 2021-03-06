package br.com.fiap.tests;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Sexo;

public class TesteCadastro {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager manager = factory.createEntityManager();
		
		Aluno aluno = new Aluno();
		aluno.setBolsista(true);
		aluno.setCpf("11111111111");
		aluno.setDataNascimento(Calendar.getInstance());
		aluno.setFoto(new byte[1024]);
		aluno.setNome("Vinicius");
		aluno.setSenhaAtendimento(123);
		aluno.setSexo(Sexo.MASCULINO);
		
		manager.getTransaction();
		manager.getTransaction().begin();
		try{
			manager.persist(aluno);
			manager.getTransaction().commit();
			System.out.println("Aluno cadastrado");
		}catch(Exception e){
			manager.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
		System.out.println("Finish");
		
	}

}
