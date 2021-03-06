package br.com.fiap.dao;

import java.util.List;

public interface BasicCRUD<obj> {
	public void cadastrar(obj o);
	public obj buscar(int key);
	public void remover(obj o);
	public List<obj> buscarTodos();
	public void alterar(obj o);
}	
