package br.com.fiap.main;

import java.lang.reflect.Method;

import br.com.fiap.annotations.Banco;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {
	public static void main(String[] args) {
		//recuperar a anota��o da classe de conex�o
		
		//API Reflection
		//Recupera a estrutura da classe e tenta recuperar a anota��o dela
		Banco anotacao = ConnectionFactory.class.getAnnotation(Banco.class);
		System.out.println("Usu�rio: " + anotacao.usuario());
		System.out.println("Senha: " + anotacao.senha());
		
		System.out.println("Anota��es m�todos");
		Method[] methods = ConnectionFactory.class.getDeclaredMethods(); //get metodos da classe
		for (Method method : methods) { //itera por cada m�todo
			Banco methodAnnotation = method.getAnnotation(Banco.class); // a anota��o espec�fica do m�todo iterado
			System.out.println("Usu�rio: " + methodAnnotation.usuario()); //pega atributos da anota��o
			System.out.println("Senha: " + methodAnnotation.senha());
		}
	}
}
