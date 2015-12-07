package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.lti.modelo.Licoes;

public class JPALicoesDAO implements ILicoesDAO {

	@Override
	public Licoes buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Licoes licao = em.find(Licoes.class, id);
		System.out.println(licao.getTitulo());
		et.commit();
		em.close();
		return licao;
	}

	@Override
	public List<Licoes> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select licao from Licoes licao");
		List<Licoes> licao = query.getResultList();
		em.close();
		return (List<Licoes>) licao;
	}

	@Override
	public void adiciona(Licoes l) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(l);
		et.commit();
		em.close();			
	}

	@Override
	public void altera(Licoes l) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Licoes licao = em.find(Licoes.class, l.getId());
		licao.setResponsavel(l.getResponsavel());
		licao.setTitulo(l.getTitulo());
		licao.setEtapa(l.getEtapa());
		licao.setDataLicao(l.getDataLicao());
		licao.setProblema(l.getProblema());
		licao.setSolucao(l.getSolucao());
		et.commit();
		em.close();	
	}
	
	@Override
	public void remove(Licoes l) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Licoes licao = em.find(Licoes.class, l.getId());
		em.remove(licao);
		et.commit();
		em.close();
	}

}
