package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPARelatorioDAO;
import br.com.lti.modelo.Relatorio;

@ManagedBean
@SessionScoped
public class RelatorioController {

	private Relatorio relatorio;
	private DataModel<Relatorio> listaRelatorio;
	 
	public DataModel<Relatorio> getListarRelatorio() {
		List<Relatorio> lista = new JPARelatorioDAO().lista();
		listaRelatorio = new ListDataModel<Relatorio>(lista);
		return listaRelatorio;
	}
	
	public Relatorio getRelatorio() {
		return relatorio;
	}
	
	public void setRelatorio(Relatorio relatorio) {
		this.relatorio = relatorio;
	}
	
	public String prepararAdicionarRelatorio(){
		relatorio = new Relatorio();
		return "gerenciarRelatorio";
	}
	
	public String prepararAlterarRelatorio(){
		relatorio = (Relatorio)(listaRelatorio.getRowData());
		return "gerenciarRelatorio";
	}
	
	public String removerRelatorio(){
		Relatorio relatorioTemp = (Relatorio)(listaRelatorio.getRowData());
		JPARelatorioDAO dao = new JPARelatorioDAO();
		dao.remove(relatorioTemp);
		return "listarRelatorio.xhtml";
	}
	
	public String adicionarRelatorio(){
		JPARelatorioDAO dao = new JPARelatorioDAO();
		dao.adiciona(relatorio);
		return "listarRelatorio.xhtml";
	}
	
	public String alterarRelatorio(){
		JPARelatorioDAO dao = new JPARelatorioDAO();
		dao.altera(relatorio);
		return "listarRelatorio.xhtml";
	}		
	
}
