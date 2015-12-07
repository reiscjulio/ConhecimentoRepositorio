package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Atividade;

public interface IAtividadeDAO {

	Atividade buscaPorId(int id);
	List<Atividade> lista();
	void adiciona(Atividade a);
	void altera(Atividade a);
	void remove(Atividade a);		
	
}
