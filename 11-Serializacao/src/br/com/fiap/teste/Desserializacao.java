package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Cliente;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("Arquivo");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
	
		Cliente cliente =(Cliente) ois.readObject();
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getRg());
		
		ois.close();
	}
}
