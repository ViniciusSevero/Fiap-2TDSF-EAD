package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_CURSO")
@SequenceGenerator(name="seqCurso",sequenceName="SQ_ALUNO",allocationSize=1)
public class Curso {
	@Id
	@Column(name="CD_CURSO",nullable=false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqCurso")
	private int codigo;
	
	@Column(name="NM_CURSO",nullable=false)
	private String nome;
	
	@Column(name="NR_HORA")
	private int horas;
	
	@Column(name="VL_PRECO")
	private double preco;
	
	@Column(name="DS_CURSO")
	private String descricao;
	
	@Column(name="DT_INICIO")
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;
	
	@Column(name="DS_TIPO")
	private TipoCurso tipo;
	
	
}
