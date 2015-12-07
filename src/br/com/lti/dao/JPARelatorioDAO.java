package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.lti.modelo.Relatorio;

public class JPARelatorioDAO implements IRelatorioDAO {

	@Override
	public Relatorio buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Relatorio relatorio = em.find(Relatorio.class, id);
		et.commit();
		em.close();
		return relatorio;
	}

	@Override
	public List<Relatorio> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select relatorios from Relatorio relatorios");
		List<Relatorio> relatorio = query.getResultList();
		em.close();
		return (List<Relatorio>) relatorio;
	}

	@Override
	public void adiciona(Relatorio r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(r);
		et.commit();
		em.close();	
	}

	@Override
	public void altera(Relatorio r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Relatorio relatorio = em.find(Relatorio.class, r.getId());
		relatorio.setTipo_relatorio(r.getTipo_relatorio());
		relatorio.setResponsavel(r.getResponsavel());
		et.commit();
		em.close();	
	}

	@Override
	public void remove(Relatorio r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Relatorio relatorio = em.find(Relatorio.class, r.getId());
		em.remove(relatorio);
		et.commit();
		em.close();	
	}

}
