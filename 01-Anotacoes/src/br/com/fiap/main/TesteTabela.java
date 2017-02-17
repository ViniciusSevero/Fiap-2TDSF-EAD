package br.com.fiap.main;

import br.com.fiap.annotations.Tabela;
import br.com.fiap.connection.Aluno;

public class TesteTabela {

	public static void main(String[] args) {
		Tabela tabela = Aluno.class.getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM "+tabela.nome());
	}

}
