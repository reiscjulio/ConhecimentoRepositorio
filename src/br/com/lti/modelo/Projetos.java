package br.com.lti.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Projetos {
	

	@Id
	@GeneratedValue	
	private int id;

	@OneToOne
	private Responsavel responsavel;	
	
	private String nome;
	private LocalDate data;
	private String titulo;
	private LocalDate data_inicio;
	private LocalDate data_conclusao;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(LocalDate data_inicio) {
		this.data_inicio = data_inicio;
	}

	public LocalDate getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(LocalDate data_conclusao) {
		this.data_conclusao = data_conclusao;
	}
}
