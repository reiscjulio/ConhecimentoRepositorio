package br.com.lti.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Relatorio {

	@Id
	@GeneratedValue	
	private int id;

	@ManyToOne
	private Responsavel responsavel;	
	
	private Byte tipo_relatorio;

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
	
	public Byte getTipo_relatorio() {
		return tipo_relatorio;
	}
	
	public void setTipo_relatorio(Byte tipo_relatorio) {
		this.tipo_relatorio = tipo_relatorio;
	}	
	
}
