package br.com.lti.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Atividade {
	
	@Id
	@GeneratedValue	
	private int id;

	private String titulo;
	private LocalDate data_inicio;
	private LocalDate data_conclusao;
	private String resumo;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}	
}
