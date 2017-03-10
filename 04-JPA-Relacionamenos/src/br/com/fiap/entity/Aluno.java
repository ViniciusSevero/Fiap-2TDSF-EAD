package br.com.fiap.entity;

import java.util.ArrayList;
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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_ALUNOS")
@SequenceGenerator(name="seqAluno",sequenceName="SQ_TB_ALUNO",allocationSize=1)
public class Aluno {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqAluno")
	private int rm;
	
	@Column(name="nm_aluno",nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="FK_ALUNO_GRUPO")
	private Grupo grupo;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="TB_ALUNO_DISCIPLINA",
			   joinColumns={@JoinColumn(name="CD_ALUNO")},
			   inverseJoinColumns={@JoinColumn(name="CD_DISCIPLINA")})
	private List<Disciplina> disciplinas = new ArrayList<>();

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
}
