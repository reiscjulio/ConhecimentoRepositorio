package br.com.lti.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Atividade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue	
	private int id;

	private String titulo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_inicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data_conclusao;
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

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}	
}
