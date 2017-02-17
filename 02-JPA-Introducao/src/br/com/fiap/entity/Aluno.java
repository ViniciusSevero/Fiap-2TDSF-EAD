package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_ALUNO")
@SequenceGenerator(name="seqAluno",sequenceName="SQ_ALUNO",allocationSize=1)
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqAluno")
	private int rm;
	
	private String nome;
	
	private String cpf;
	
	@Column(name="DT_NASCIMENTO")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	private Sexo sexo;
	
	@Lob 
	private byte[] foto;
	
	private boolean bolsista;
	
	@Transient //não persiste no banco
	private int senhaAtendimento;
	
}
