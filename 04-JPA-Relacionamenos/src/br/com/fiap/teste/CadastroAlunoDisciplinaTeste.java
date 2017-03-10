package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.dao.GenericDAO;
import br.com.fiap.entity.Aluno;
import br.com.fiap.entity.Disciplina;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class CadastroAlunoDisciplinaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		
		GenericDAO<Aluno, Integer> alunoDao = new AlunoDAO(manager);
		Aluno a = new Aluno();
		a.setNome("Trevor McGonnall");
		a.getDisciplinas().add(new Disciplina(0,"EAD",120,"Entrepise Applicaion DEvelopment"));
		a.getDisciplinas().add(new Disciplina(0,"CALC2",120,"Cálculo 2"));
		alunoDao.cadastrar(a);
		try{
			alunoDao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
		
	}

}
