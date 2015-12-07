package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPAResponsavelDAO;
import br.com.lti.modelo.Responsavel;

@ManagedBean
@SessionScoped
public class ResponsavelController {

	private Responsavel responsavel;
	private DataModel<Responsavel> listaResponsavel;
	 
	public DataModel<Responsavel> getListarResponsavel() {
		List<Responsavel> lista = new JPAResponsavelDAO().lista();
		listaResponsavel = new ListDataModel<Responsavel>(lista);
		return listaResponsavel;
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public String prepararAdicionarResponsavel(){
		responsavel = new Responsavel();
		return "gerenciarResponsavel";
	}
	
	public String prepararAlterarResponsavel(){
		responsavel = (Responsavel)(listaResponsavel.getRowData());
		return "gerenciarResponsavel";
	}
	
	public String removerResponsavel(){
		Responsavel responsavelTemp = (Responsavel)(listaResponsavel.getRowData());
		JPAResponsavelDAO dao = new JPAResponsavelDAO();
		dao.remove(responsavelTemp);
		return "listarResponsavel.xhtml";
	}
	
	public String adicionarResponsavel(){
		JPAResponsavelDAO dao = new JPAResponsavelDAO();
		dao.adiciona(responsavel);
		return "listarResponsavel.xhtml";
	}
	
	public String alterarResponsavel(){
		JPAResponsavelDAO dao = new JPAResponsavelDAO();
		dao.altera(responsavel);
		return "listarResponsavel.xhtml";
	}		
	
}
