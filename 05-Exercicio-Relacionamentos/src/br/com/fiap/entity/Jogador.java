package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(sequenceName="SEQ_JOGADOR",name="SEQ_JOGADOR",allocationSize=1)
public class Jogador {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_JOGADOR")
	@Column(name="CD_JOGADOR")
	private int codigo;
	
	@Column(name="NM_JOGADOR", nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="FK_JOGADOR_TIME")
	private Time time;
	
	public Jogador() {
		// TODO Auto-generated constructor stub
	}

	public Jogador(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	
}
