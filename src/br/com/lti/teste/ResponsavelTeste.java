package br.com.lti.teste;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.com.lti.dao.JPAResponsavelDAO;
import br.com.lti.modelo.Responsavel;

public class ResponsavelTeste {

	@Test
	public void deveriaCriarResponsavel(){
		Responsavel responsavel = new Responsavel();
		
		responsavel.setNome("Ojuara");
		responsavel.setMatricula(1808003211);
		responsavel.setFuncao("Analista");
		responsavel.setSenha("54321");
		responsavel.setLogin("ojuara");

		JPAResponsavelDAO responsavelDAO = new JPAResponsavelDAO();
		responsavelDAO.adiciona(responsavel);
		
		assertEquals ("Ojuara", responsavel.getNome());
		assertEquals (1808003211, responsavel.getMatricula());
		assertEquals ("Analista", responsavel.getFuncao());
		assertEquals ("54321", responsavel.getSenha());	
		assertEquals ("ojuara", responsavel.getLogin());				
	}

//	@Test
//	public void deveriaEditarResponsavel(){
//		Responsavel responsavel = new Responsavel();
//				
//		responsavel.setId(2);
//		responsavel.setNome("Araujo");
//		responsavel.setMatricula(1123080018);
//		responsavel.setFuncao("Desenvolvedor");
//		responsavel.setSenha("12345");
//		responsavel.setLogin("araujo");		
//		
//		JPAResponsavelDAO responsavelDAO = new JPAResponsavelDAO();
//		responsavelDAO.altera(responsavel);
//
//		assertEquals ("Araujo", responsavel.getNome());
//		assertEquals (1123080018, responsavel.getMatricula());
//		assertEquals ("Desenvolvedor", responsavel.getFuncao());
//		assertEquals ("12345", responsavel.getSenha());	
//		assertEquals ("araujo", responsavel.getLogin());
//	}	

	@Test
	public void deveriaListarResponsavel(){
		JPAResponsavelDAO responsavelDAO = new JPAResponsavelDAO();
		List<Responsavel> responsaveis = responsavelDAO.lista();
		for (Responsavel responsavel : responsaveis) {
			System.out.println(responsavel.getNome());
			
		}
	}	
	
//	@Test
//	public void deveriaDeletarResponsavel(){
//		JPAResponsavelDAO responsavelDAO = new JPAResponsavelDAO();
//		Responsavel responsavel = responsavelDAO.buscaPorId(1);		
//		responsavelDAO.remove(responsavel);				
//	}
	
}
