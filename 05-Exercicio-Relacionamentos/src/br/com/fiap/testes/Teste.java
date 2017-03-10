package br.com.fiap.testes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.GenericDAO;
import br.com.fiap.dao.GenericDAOImpl;
import br.com.fiap.dao.TimeDAO;
import br.com.fiap.entity.Campeonato;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Tecnico;
import br.com.fiap.entity.Time;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory factory = EntityManagerFactorySingleton.getInstance();
		EntityManager manager = factory.createEntityManager();
		
		GenericDAO<Time, Integer> dao = new TimeDAO(manager);
		Time time = new Time();
		time.setDtFundacao(Calendar.getInstance());
		time.setNome("Time do Juli�o");
		time.setNritulo(8000);
		
		List<Jogador> jogadores = new ArrayList<Jogador>();
		jogadores.add(new Jogador(0, "William"));
		jogadores.add(new Jogador(0, "Vinicius"));
		
		List<Campeonato> campeonatos = new ArrayList<>();
		campeonatos.add(new Campeonato(0, "Campeonato 1"));
		campeonatos.add(new Campeonato(0, "Campeonato 2"));
		
		time.setTecnico(new Tecnico(0,"Juli�o"));
		time.setJogadores(jogadores);
		time.setCampeonatos(campeonatos);
		
		dao.cadastrar(time);
		try{
			dao.salvar();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			manager.close();
			factory.close();
		}
	}
}
