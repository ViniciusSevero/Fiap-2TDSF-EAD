package br.com.fiap.connection;

import br.com.fiap.annotations.Banco;

@Banco(usuario="Vini",senha="teste123")
public class ConnectionFactory {
	
	@Banco(usuario="Ines",senha="12345")
	public void conectarOracle(){
		
	}
	@Banco(usuario="Will",senha="54321")
	public void conectarMySql(){
		
	}
}
