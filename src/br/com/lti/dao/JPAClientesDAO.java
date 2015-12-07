package br.com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.lti.modelo.Clientes;

public class JPAClientesDAO implements IClientesDAO{

	@Override
	public Clientes buscaPorId(int id) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Clientes clientes = em.find(Clientes.class, id);
		et.commit();
		em.close();
		return clientes;
	}

	@Override
	public List<Clientes> lista() {
		EntityManager em = Util.getEntityManagerRepositorio();
		Query query = em.createQuery("select cliente from Clientes cliente");
		List<Clientes> clientes = query.getResultList();
		em.close();
		return (List<Clientes>) clientes;
	}

	@Override
	public void adiciona(Clientes c) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(c);
		et.commit();
		em.close();
	}

	@Override
	public void altera(Clientes c) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Clientes clientes = em.find(Clientes.class, c.getId());
		clientes.setArea(c.getArea());
		clientes.setNome(c.getNome());
		et.commit();
		em.close();	
	}

	@Override
	public void remove(Clientes c) {
		EntityManager em = Util.getEntityManagerRepositorio();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Clientes clientes = em.find(Clientes.class, c.getId());
		em.remove(clientes);
		et.commit();
		em.close();	
	}

}
