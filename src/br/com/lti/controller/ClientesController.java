package br.com.lti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.lti.dao.JPAClientesDAO;
import br.com.lti.modelo.Clientes;

@ManagedBean
@SessionScoped
public class ClientesController {

	private Clientes clientes;
	private DataModel<Clientes> listaClientes;
	 
	public DataModel<Clientes> getListarClientes() {
		List<Clientes> lista = new JPAClientesDAO().lista();
		listaClientes = new ListDataModel<Clientes>(lista);
		return listaClientes;
	}
	
	public Clientes getClientes() {
		return clientes;
	}
	
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	public String prepararAdicionarClientes(){
		clientes = new Clientes();
		return "gerenciarClientes";
	}
	
	public String prepararAlterarClientes(){
		clientes = (Clientes)(listaClientes.getRowData());
		return "gerenciarClientes";
	}
	
	public String removerClientes(){
		Clientes clientesTemp = (Clientes)(listaClientes.getRowData());
		JPAClientesDAO dao = new JPAClientesDAO();
		dao.remove(clientesTemp);
		return "listarClientes.xhtml";
	}
	
	public String adicionarClientes(){
		JPAClientesDAO dao = new JPAClientesDAO();
		dao.adiciona(clientes);
		return "listarClientes.xhtml";
	}
	
	public String alterarClientes(){
		JPAClientesDAO dao = new JPAClientesDAO();
		dao.altera(clientes);
		return "listarClientes.xhtml";
	}		
	
}
