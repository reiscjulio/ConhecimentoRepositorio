package br.com.lti.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.lti.modelo.Clientes;

public class ClientesTeste {
	@Test
	public void deveriaCriarClientes()
	{
		Clientes cliente = new Clientes();
		
		cliente.setNome("Vitor");
		cliente.setArea("Vendas");
		
		assertEquals("Vitor", cliente.getNome());
		assertEquals("Vendas", cliente.getArea());
	}
	
	@Test
	public void deveriaEditarClientes()
	{
		Clientes cliente = new Clientes();
		
		cliente.setNome("Julio");
		cliente.setArea("Marketing");
		
		assertEquals("Julio", cliente.getNome());
		assertEquals("Marketing", cliente.getArea());
	}
	
//	@Test
//	public void deveriaListarClientes()
//	{
//		JPAClientesDAO clientesDAO = new JPAClientesDAO();
//		List<Clientes> clientes = ClientesDAO.lista();
//		for (Clientes clientes : clientes) {
//			System.out.println(clientes.getNome());			
//		}
//	}
//	
//	@Test
//	public void deveriaDeletarClientes()
//	{
//		JPAClientesDAO ClientesDAO = new JPAClientesDAO();
//		Clientes clientes = ClientesDAO.buscaPorId(1);
//		projetosDAO.remove(Clientes);
//	}
}
