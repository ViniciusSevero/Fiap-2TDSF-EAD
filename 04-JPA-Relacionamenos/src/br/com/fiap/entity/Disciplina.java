package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_DISCIPLINA")
@SequenceGenerator(sequenceName="SEQ_DISCIPLINA",name="SEQ_DISCIPLINA",allocationSize=1)
public class Disciplina {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_DISCIPLINA")
	@Column(name="CD_DISCIPLINA")
	private int codigo;
	
	@Column(name="NM_DISCIPLINA",nullable=false)
	private String nome;
	
	@Column(name="VL_CARGA_HORARIA",nullable=false)
	private int cargaHoraria;
	
	@Column(name="DS_DISCIPLINA")
	private String descricao;
	
	@ManyToMany(mappedBy="disciplinas")
	private List<Aluno> alunos = new ArrayList<>();
	
	public Disciplina() {
		// TODO Auto-generated constructor stub
	}
	
	public Disciplina(int codigo, String nome, int cargaHoraria, String descricao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
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
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
}