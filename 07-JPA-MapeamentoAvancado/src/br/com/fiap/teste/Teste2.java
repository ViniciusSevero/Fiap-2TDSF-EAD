package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;

import br.com.fiap.dao.AluguelDAO;
import br.com.fiap.dao.DependenteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.DependenteDAOImpl;
import br.com.fiap.entity.Aluguel;
import br.com.fiap.entity.AluguelDAOImpl;
import br.com.fiap.entity.Automovel;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Dependente;
import br.com.fiap.entity.Funcionario;

public class Teste2 {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		DependenteDAO dao = new DependenteDAOImpl(em);
		
		Funcionario f = new Funcionario();
		f.setNome("Vinicius");
		f.setDtAdmissao(Calendar.getInstance());
		
		Dependente d = new Dependente();
		d.setFuncionario(f);
		d.setNome("Alice");
		
		
		try{
			dao.cadastrar(d);
			dao.salvar();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
		

	}
}
