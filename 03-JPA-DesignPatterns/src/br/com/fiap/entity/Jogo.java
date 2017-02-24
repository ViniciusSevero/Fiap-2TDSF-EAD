package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGO")
@SequenceGenerator(sequenceName="SEQ_TB_JOGO",name="SEQ_TB_JOGO",allocationSize=1)
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_TB_JOGO")
	@Column(name="CD_JOO")
	private int codigo;
	
	@Column(nullable=false,name="DS_TITULO",length=100)
	private String titulo;
	
	@Column(name="VL_JOGO")
	private int preco;
	
	@Column(name="DS_GENERO")
	private String genero;
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}


	public Jogo(int codigo, String titulo, int preco, String genero) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
		this.genero = genero;
	}
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Jogo [codigo=" + codigo + ", titulo=" + titulo + ", preco=" + preco + ", genero=" + genero + "]";
	}
	
	
}