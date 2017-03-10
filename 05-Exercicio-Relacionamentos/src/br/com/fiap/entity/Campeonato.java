package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_CAMPEONATO")
@SequenceGenerator(sequenceName="SEQ_CAMPEONATO",name="SEQ_CAMPEONATO",allocationSize=1)
public class Campeonato {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_CAMPEONATO")
	@Column(name="CD_CAMPEONATO")
	private int codigo;
	
	@Column(name="NM_CAMPEONATO", nullable=false)
	private String nome;
	
	@ManyToMany(mappedBy="campeonatos",cascade=CascadeType.PERSIST)
	private List<Time> times;
	
	public Campeonato() {
		// TODO Auto-generated constructor stub
	}

	public Campeonato(int codigo, String nome) {
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

	public List<Time> getTimes() {
		return times;
	}

	public void setTime(List<Time> times) {
		this.times = times;
	}
	

}