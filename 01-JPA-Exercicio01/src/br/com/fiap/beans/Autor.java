package br.com.fiap.beans;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(sequenceName="seq_autor",name="seqAutor",allocationSize=1)
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqAutor")
	private int id;
	
	@Column(nullable=false,length=300)
	private String nome;
	
	@Column(nullable=false)
	private Sexo sexo;
	
	@Column(nullable=false,length=300)
	private String sobrenome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dtNascimento;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(int id, String nome, Sexo sexo, String sobrenome, Calendar dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.sobrenome = sobrenome;
		this.dtNascimento = dtNascimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", sobrenome=" + sobrenome + ", dtNascimento="
				+ dtNascimento + "]";
	}
	
	
	
}