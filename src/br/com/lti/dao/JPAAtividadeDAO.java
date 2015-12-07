package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.lti.modelo.Atividade;

public class JPAAtividadeDAO implements IAtividadeDAO {

	@Override
	public Atividade buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Atividade atividade = em.find(Atividade.class, id);
		et.commit();
		em.close();
		return atividade;
	}

	@Override
	public List<Atividade> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select atividades from Atividade atividades");
		List<Atividade> atividade = query.getResultList();
		em.close();
		return (List<Atividade>) atividade;
	}

	@Override
	public void adiciona(Atividade a) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(a);
		et.commit();
		em.close();	
	}

	@Override
	public void altera(Atividade a) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Atividade atividade = em.find(Atividade.class, a.getId());
		atividade.setData_conclusao(a.getData_conclusao());
		atividade.setData_inicio(a.getData_inicio());
		atividade.setResumo(a.getResumo());
		atividade.setTitulo(a.getTitulo());
		et.commit();
		em.close();	
	}

	@Override
	public void remove(Atividade a) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Atividade atividade = em.find(Atividade.class, a.getId());
		em.remove(atividade);
		et.commit();
		em.close();	
	}
	
}
