package br.com.lti.modelo;

import java.util.Calendar;

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
	private Calendar data_projeto;
	private String titulo;
	private Calendar data_inicio;
	private Calendar data_conclusao;	
	
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

	public Calendar getData() {
		return data_projeto;
	}

	public void setData(Calendar data_projeto) {
		this.data_projeto = data_projeto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Calendar getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Calendar data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Calendar getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Calendar data_conclusao) {
		this.data_conclusao = data_conclusao;
	}
}
