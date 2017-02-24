package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.JogoDAO;
import br.com.fiap.dao.JogoDAOImpl;
import br.com.fiap.entity.Jogo;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteAlterar {

	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		JogoDAO dao = new JogoDAOImpl(manager);
		Jogo jogo = dao.buscar(2);
		jogo.setTitulo("Thw Wicher 3");
		dao.atualizar(jogo);
		try{
			dao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}

	}

}
