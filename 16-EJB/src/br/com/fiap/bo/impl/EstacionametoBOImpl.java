package br.com.fiap.bo.impl;

import javax.ejb.Stateless;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import br.com.fiap.bo.EstacionamentoBO;

@Stateless
public class EstacionametoBOImpl implements EstacionamentoBO {

	@Override
	public double calcularValor(int horaInicial, int horaFinal) {
		return  (horaFinal - horaInicial) * 10;
	}
}
