package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
//import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.lti.dao.Util;
import br.com.lti.modelo.Responsavel;

public class JPAResponsavelDAO implements IResponsavelDAO {
		
	@Override
	public Responsavel buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Responsavel responsavel = em.find(Responsavel.class, id);
		et.commit();
		em.close();
		return responsavel;
	}	
	
	@Override
	public List<Responsavel> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select responsaveis from Responsavel responsaveis");
		List<Responsavel> responsaveis = query.getResultList();
		em.close();
		return (List<Responsavel>) responsaveis;
	}

	@Override
	public void adiciona(Responsavel r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(r);
		et.commit();
		em.close();		
	}

	@Override
	public void altera(Responsavel r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Responsavel responsavel = em.find(Responsavel.class, r.getId());
		responsavel.setNome(r.getNome());
		responsavel.setMatricula(r.getMatricula());
		responsavel.setFuncao(r.getFuncao());
		responsavel.setSenha(r.getSenha());
		responsavel.setLogin(r.getLogin());
		et.commit();
		em.close();	
	}

	@Override
	public void remove(Responsavel r) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Responsavel responsavel = em.find(Responsavel.class, r.getId());
		em.remove(responsavel);
		et.commit();
		em.close();			
	}

}
