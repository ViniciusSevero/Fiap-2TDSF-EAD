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
@Table(name="T_TDSF_FUNCIONARIO")
@SequenceGenerator(name="SEQ_TDSF_FUNC", sequenceName="SEQ_TDSF_FUNC", allocationSize=1)
public class Funcionario {
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_TDSF_FUNC")
	@Column(name="CD_FUNCIONARIO")
	private int codigo;
	
	@Column(name="NM_FUNCIONARIO", nullable=false)
	private String nome;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dtAdmissao;

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

	public Calendar getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Calendar dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	
	
}
