package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Clientes;

public interface IClientesDAO {

	Clientes buscaPorId(int id);
	List<Clientes> lista();
	void adiciona(Clientes c);
	void altera(Clientes c);
	void remove(Clientes c);		
	
}
