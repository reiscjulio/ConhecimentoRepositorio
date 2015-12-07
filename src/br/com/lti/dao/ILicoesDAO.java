package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Licoes;

public interface ILicoesDAO {

	Licoes buscaPorId(int id);
	List<Licoes> lista();
	void adiciona(Licoes l);
	void altera(Licoes l);
	void remove(Licoes l);		
	
}
