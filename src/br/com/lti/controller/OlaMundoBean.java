package br.com.lti.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaMundoBean {

	private String mensagem = "Quem � voc�?";
	private String nome;
	
	public String getMensagem() {
		return mensagem;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void nomeFoiDigitado() {
		System.out.println(getNome());
	}
	
}
