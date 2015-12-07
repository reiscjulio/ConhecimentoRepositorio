package br.com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Util {

	public static EntityManager getEntityManagerRepositorio(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("repositorio");
		EntityManager em = factory.createEntityManager();
		em.getEntityManagerFactory().getCache().evictAll();
		return em;
	}	
	
}
