package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPALicoesDAO;
import br.com.lti.modelo.Licoes;

@ManagedBean
@SessionScoped
public class LicoesController {

	private Licoes licoes;
	private DataModel<Licoes> listaLicoes;
	 
	public DataModel<Licoes> getListarLicoes() {
		List<Licoes> lista = new JPALicoesDAO().lista();
		listaLicoes = new ListDataModel<Licoes>(lista);
		return listaLicoes;
	}
	
	public Licoes getLicoes() {
		return licoes;
	}
	
	public void setLicoes(Licoes licoes) {
		this.licoes = licoes;
	}
	
	public String prepararAdicionarLicoes(){
		licoes = new Licoes();
		return "gerenciarLicoes";
	}
	
	public String prepararAlterarLicoes(){
		licoes = (Licoes)(listaLicoes.getRowData());
		return "gerenciarLicoes";
	}
	
	public String removerLicoes(){
		Licoes licoesTemp = (Licoes)(listaLicoes.getRowData());
		JPALicoesDAO dao = new JPALicoesDAO();
		dao.remove(licoesTemp);
		return "listarLicoes.xhtml";
	}
	
	public String adicionarLicoes(){
		JPALicoesDAO dao = new JPALicoesDAO();
		dao.adiciona(licoes);
		return "listarLicoes.xhtml";
	}
	
	public String alterarLicoes(){
		JPALicoesDAO dao = new JPALicoesDAO();
		dao.altera(licoes);
		return "listarLicoes.xhtml";
	}			
	
}
