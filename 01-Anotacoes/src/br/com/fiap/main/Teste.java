package br.com.fiap.main;

import java.lang.reflect.Method;

import br.com.fiap.annotations.Banco;
import br.com.fiap.connection.ConnectionFactory;

public class Teste {
	public static void main(String[] args) {
		//recuperar a anotação da classe de conexão
		
		//API Reflection
		//Recupera a estrutura da classe e tenta recuperar a anotação dela
		Banco anotacao = ConnectionFactory.class.getAnnotation(Banco.class);
		System.out.println("Usuário: " + anotacao.usuario());
		System.out.println("Senha: " + anotacao.senha());
		
		System.out.println("Anotações métodos");
		Method[] methods = ConnectionFactory.class.getDeclaredMethods(); //get metodos da classe
		for (Method method : methods) { //itera por cada método
			Banco methodAnnotation = method.getAnnotation(Banco.class); // a anotação específica do método iterado
			System.out.println("Usuário: " + methodAnnotation.usuario()); //pega atributos da anotação
			System.out.println("Senha: " + methodAnnotation.senha());
		}
	}
}
