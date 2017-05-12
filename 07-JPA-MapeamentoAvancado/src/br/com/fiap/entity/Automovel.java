package br.com.fiap.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_AUTOMOVEL")
@SequenceGenerator(name="SEQ_AUTOMOVEL", sequenceName="SEQ_AUTOMOVEL", allocationSize=1)
public class Automovel {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE , generator="SEQ_AUTOMOVEL")
	private int codigo;
	
	private String modelo;
	private String marca;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Automovel [codigo=" + codigo + ", modelo=" + modelo + ", marca=" + marca + "]";
	}

}
