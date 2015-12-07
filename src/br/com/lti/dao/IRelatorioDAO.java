package br.com.lti.dao;

import java.util.List;

import br.com.lti.modelo.Relatorio;

public interface IRelatorioDAO {

	Relatorio buscaPorId(int id);
	List<Relatorio> lista();
	void adiciona(Relatorio r);
	void altera(Relatorio r);
	void remove(Relatorio r);		
	
}
