package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPAProjetosDAO;
import br.com.lti.modelo.Projetos;

@ManagedBean
@SessionScoped
public class ProjetosController {

	private Projetos projetos;
	private DataModel<Projetos> listaProjetos;
	 
	public DataModel<Projetos> getListarProjetos() {
		List<Projetos> lista = new JPAProjetosDAO().lista();
		listaProjetos = new ListDataModel<Projetos>(lista);
		return listaProjetos;
	}
	
	public Projetos getProjetos() {
		return projetos;
	}
	
	public void setProjetos(Projetos projetos) {
		this.projetos = projetos;
	}
	
	public String prepararAdicionarProjetos(){
		projetos = new Projetos();
		return "gerenciarProjetos";
	}
	
	public String prepararAlterarProjetos(){
		projetos = (Projetos)(listaProjetos.getRowData());
		return "gerenciarProjetos";
	}
	
	public String removerProjetos(){
		Projetos projetosTemp = (Projetos)(listaProjetos.getRowData());
		JPAProjetosDAO dao = new JPAProjetosDAO();
		dao.remove(projetosTemp);
		return "listarProjetos.xhtml";
	}
	
	public String adicionarProjetos(){
		JPAProjetosDAO dao = new JPAProjetosDAO();
		dao.adiciona(projetos);
		return "listarProjetos.xhtml";
	}
	
	public String alterarProjetos(){
		JPAProjetosDAO dao = new JPAProjetosDAO();
		dao.altera(projetos);
		return "listarProjetos.xhtml";
	}		
	
}
