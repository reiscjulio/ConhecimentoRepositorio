package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Projetos;

public interface IProjetosDAO {
	
	Projetos buscaPorId(int id);
	List<Projetos> lista();
	void adiciona(Projetos p);
	void altera(Projetos p);
	void remove(Projetos p);
}
