package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTORA")
@SequenceGenerator(sequenceName="SEQ_TB_PRODUTORA",name="SEQ_TB_PRODUTORA",allocationSize=1)
public class Produtora {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_TB_PRODUTORA")
	@Column(name="CD_PRODUTORA")
	private int codigo;
	
	@Column(name="NM_PRODUTORA")
	private String nome;
	
	public Produtora() {
		// TODO Auto-generated constructor stub
	}

	public Produtora(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produtora [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	
	
}
