package br.com.lti.teste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.Test;

import br.com.lti.dao.JPALicoesDAO;
import br.com.lti.dao.JPAProjetosDAO;
import br.com.lti.modelo.Licoes;
import br.com.lti.modelo.Projetos;

public class ProjetosTeste {
	@Test
	public void deveriaCriarProjeto()
	{
		Projetos projeto = new Projetos();
		
		projeto.setNome("Repositório de conhecimento");
		projeto.setData(LocalDate.of(2015, Month.MARCH, 5));
		projeto.setTitulo("Trabalho de LTI");
		projeto.setData_inicio(LocalDate.of(2015, Month.MARCH, 5));
		projeto.setData_conclusao(LocalDate.of(2015, Month.DECEMBER, 5));
		
		assertEquals ("Repositório de conhecimento", projeto.getNome());
		assertEquals (LocalDate.of(2015, Month.MARCH, 5), projeto.getData());
		assertEquals ("Trabalho de LTI", projeto.getTitulo());
		assertEquals (LocalDate.of(2015, Month.MARCH, 5), projeto.getData_inicio());
		assertEquals (LocalDate.of(2015, Month.DECEMBER, 5), projeto.getData_conclusao());
	}
	
	@Test
	public void deveriaEditarProjeto()
	{
		Projetos projeto = new Projetos();
		
		projeto.setNome("Repositório");
		projeto.setData(LocalDate.of(2015, Month.MAY, 10));
		projeto.setTitulo("Estágio");
		projeto.setData_inicio(LocalDate.of(2015, Month.MAY, 10));
		projeto.setData_conclusao(LocalDate.of(2015, Month.DECEMBER, 4));
		
		assertEquals ("Repositório", projeto.getNome());
		assertEquals (LocalDate.of(2015, Month.MAY, 10), projeto.getData());
		assertEquals ("Estágio", projeto.getTitulo());
		assertEquals (LocalDate.of(2015, Month.MAY, 10), projeto.getData_inicio());
		assertEquals (LocalDate.of(2015, Month.DECEMBER, 4), projeto.getData_conclusao());
	}
	
//	@Test
//	public void deveriaListarProjetos()
//	{
//		JPAProjetosDAO projetosDAO = new JPAProjetosDAO();
//		List<Projetos> projetos = ProjetosDAO.lista();
//		for (Projetos projeto : projetos) {
//			System.out.println(projeto.getNome());			
//		}
//	}
//	
//	@Test
//	public void deveriaDeletarProjetos()
//	{
//		JPAProjetosDAO projetosDAO = new JPAProjetosDAO();
//		Projetos projeto = projetosDAO.buscaPorId(1);
//		projetosDAO.remove(projeto);
//	}
}
