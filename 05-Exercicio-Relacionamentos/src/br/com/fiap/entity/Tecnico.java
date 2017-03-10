package br.com.fiap.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_TECNICO")
@SequenceGenerator(sequenceName="SEQ_TECNICO",name="SEQ_TECNICO",allocationSize=1)
public class Tecnico {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_TECNICO")
	@Column(name="CD_TECNICO")
	private int codigo;
	
	@Column(name="NM_TECNICO",nullable=false)
	private String nome;
	
	@OneToOne(mappedBy="tecnico")
	private Time time;

	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	
	public Tecnico(int codigo, String nome) {
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
	
	
}