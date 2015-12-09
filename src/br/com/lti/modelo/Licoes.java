package br.com.lti.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Licoes {

	@Id
	@GeneratedValue	
	private int id;	
	
	@ManyToOne
	private Responsavel responsavel;

	private String titulo;
	private int etapa;
	private Calendar data_licao;
	private String problema;
	private String solucao;
	
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
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getEtapa() {
		return etapa;
	}
	
	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}
	
	public Calendar getData_licao() {
		return data_licao;
	}
	
	public void setData_licao(Calendar data_licao) {
		this.data_licao = data_licao;
	}
	
	public String getProblema() {
		return problema;
	}
	
	public void setProblema(String problema) {
		this.problema = problema;
	}
	
	public String getSolucao() {
		return solucao;
	}
	
	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}	
	
}
