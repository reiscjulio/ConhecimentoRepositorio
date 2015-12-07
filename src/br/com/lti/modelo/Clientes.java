package br.com.lti.modelo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Clientes {
	
	@Id
	@GeneratedValue	
	private int id;

	@ManyToMany
	private Set<Projetos> projetos;
	
	@ManyToMany
	private Set<Atividade> atividades;	
	
	private String nome;
	private String area;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Projetos> getProjetos() {
		return projetos;
	}

	public void setProjetos(Set<Projetos> projetos) {
		this.projetos = projetos;
	}

	public Set<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(Set<Atividade> atividades) {
		this.atividades = atividades;
	}
	
	
	
}
