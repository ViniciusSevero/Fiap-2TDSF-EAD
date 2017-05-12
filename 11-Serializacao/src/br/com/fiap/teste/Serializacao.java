package br.com.fiap.teste;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Cliente;

public class Serializacao {

	public static void main(String[] args) throws Exception{
		
		Cliente cliente = new Cliente("Edu Guiga","21322311");
		
		FileOutputStream outstream = new FileOutputStream("arquivo");
		
		ObjectOutputStream objectStream = new ObjectOutputStream(outstream);
		
		objectStream.writeObject(cliente);
		System.out.println("Cliente serializado");
		
		objectStream.close();
		
	}
}
