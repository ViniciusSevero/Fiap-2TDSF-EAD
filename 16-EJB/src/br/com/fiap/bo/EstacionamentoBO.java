package br.com.fiap.bo;

import javax.ejb.Local;

@Local
public interface EstacionamentoBO {
	double calcularValor(int horaInicial, int horaFinal);
}	
