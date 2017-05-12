package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public interface PacoteDAO extends GenericDAO<Pacote,Integer>{
	
	public List<Pacote> listar();
	
	public List<Pacote> buscarPorPrecoMaximo(float preco);
	
	public List<Pacote> buscarPorTransporte(Transporte transporte);
	
	public List<Pacote> buscarPoDatas(Calendar inicio, Calendar fim);
	
	public double getPrecoMedio();
	
	public int buscarQtdePacotesPotDatas(Calendar inicio, Calendar fim);
	
	public List<Pacote> buscarPacoteComMaiorPreco();

}
