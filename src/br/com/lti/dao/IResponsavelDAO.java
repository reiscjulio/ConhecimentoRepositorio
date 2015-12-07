package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Responsavel;

public interface IResponsavelDAO {

	Responsavel buscaPorId(int id);
	List<Responsavel> lista();
	void adiciona(Responsavel r);
	void altera(Responsavel r);
	void remove(Responsavel r);	
	
}
