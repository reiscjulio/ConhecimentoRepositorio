package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.lti.modelo.Projetos;
import br.com.lti.modelo.Responsavel;

public class JPAProjetosDAO implements IProjetosDAO {

	@Override
	public Projetos buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Projetos projetos = em.find(Projetos.class, id);
		System.out.println(projetos.getNome());
		et.commit();
		em.close();
		return projetos;
	}	
	
	@Override
	public List<Projetos> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select projeto from Projetos projeto");
		List<Projetos> projetos = query.getResultList();
		em.close();
		return (List<Projetos>) projetos;
	}

	@Override
	public void adiciona(Projetos p) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(p);
		et.commit();
		em.close();		
	}

	@Override
	public void altera(Projetos p) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Projetos projetos = em.find(Projetos.class, p.getId());
		projetos.setData(p.getData());
		projetos.setData_conclusao(p.getData_conclusao());
		projetos.setData_inicio(p.getData_inicio());
		projetos.setNome(p.getNome());
		projetos.setTitulo(p.getTitulo());
		projetos.setResponsavel(p.getResponsavel());
		et.commit();
		em.close();		
	}

	@Override
	public void remove(Projetos p) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Projetos projetos = em.find(Projetos.class, p.getId());
		em.remove(projetos);
		et.commit();
		em.close();			
	}
	
}
