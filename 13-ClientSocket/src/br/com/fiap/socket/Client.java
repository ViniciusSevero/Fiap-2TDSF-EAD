package br.com.fiap.socket;
import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Cliente;


public class Client {

	public static void main(String[] args) throws Exception{
		Socket socket = new Socket("10.3.2.41",123);
		ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
		
		Cliente cliente = new Cliente("Teste","123");
		
		outputStream.writeObject(cliente);
		socket.close();
	}
}
