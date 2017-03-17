package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(sequenceName="seq_livro",name="seqLivro",allocationSize=1)
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="seqLivro")
	private int isbn;
	
	@Column(nullable=false, length=200)
	private String titulo;
	private double preco;
	
	@Column(name="dt_lancamento")
	@Temporal(TemporalType.DATE)
	private Calendar dtLancamento;
	
	@Lob
	private byte[] capa;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="AUTOR_LIVRO",
	   joinColumns={@JoinColumn(name="LIVO_isbn")},
	   inverseJoinColumns={@JoinColumn(name="AUTOR_id")})
	private List<Autor> autores = new ArrayList<>();
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="EDITORA_id")
	private Editora editora;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public Livro(int isbn, String titulo, double preco, Calendar dtLancamento, byte[] capa) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.preco = preco;
		this.dtLancamento = dtLancamento;
		this.capa = capa;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Calendar getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Calendar dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public byte[] getCapa() {
		return capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", preco=" + preco + ", dtLancamento=" + dtLancamento
				+ ", capa=" + Arrays.toString(capa) + "]";
	}
	
	
	
}