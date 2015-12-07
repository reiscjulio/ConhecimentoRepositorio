package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPAAtividadeDAO;
import br.com.lti.modelo.Atividade;

@ManagedBean
@SessionScoped
public class AtividadeController {

	private Atividade atividade;
	private DataModel<Atividade> listaAtividade;
	 
	public DataModel<Atividade> getListarAtividade() {
		List<Atividade> lista = new JPAAtividadeDAO().lista();
		listaAtividade = new ListDataModel<Atividade>(lista);
		return listaAtividade;
	}
	
	public Atividade getAtividade() {
		return atividade;
	}
	
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	public String prepararAdicionarAtividade(){
		atividade = new Atividade();
		return "gerenciarAtividade";
	}
	
	public String prepararAlterarAtividade(){
		atividade = (Atividade)(listaAtividade.getRowData());
		return "gerenciarAtividade";
	}
	
	public String removerAtividade(){
		Atividade atividadeTemp = (Atividade)(listaAtividade.getRowData());
		JPAAtividadeDAO dao = new JPAAtividadeDAO();
		dao.remove(atividadeTemp);
		return "listarAtividade.xhtml";
	}
	
	public String adicionarAtividade(){
		JPAAtividadeDAO dao = new JPAAtividadeDAO();
		dao.adiciona(atividade);
		return "listarAtividade.xhtml";
	}
	
	public String alterarAtividade(){
		JPAAtividadeDAO dao = new JPAAtividadeDAO();
		dao.altera(atividade);
		return "listarAtividade.xhtml";
	}		
	
}
