package br.com.lti.teste;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.Test;

import br.com.lti.dao.JPALicoesDAO;
import br.com.lti.modelo.Licoes;
import br.com.lti.modelo.Responsavel;

public class LicoesTeste {

	@Test
	public void deveriaCriarLicoes(){
		Responsavel responsavel = new Responsavel();
		responsavel.setId(1);
		
		Licoes licao = new Licoes();
		
		licao.setResponsavel(responsavel);
		licao.setTitulo("Hibernate");
		licao.setEtapa(1);
		licao.setDataLicao(LocalDate.of(2015, Month.APRIL, 12));
		licao.setProblema("Conexão postgre");
		licao.setSolucao("Corrigir url do banco");

		JPALicoesDAO licaoDAO = new JPALicoesDAO();
		licaoDAO.adiciona(licao);
		
		assertEquals (1, licao.getResponsavel().getId());
		assertEquals ("Hibernate", licao.getTitulo());
		assertEquals (1, licao.getEtapa());
		assertEquals (LocalDate.of(2015, Month.APRIL, 12), licao.getDataLicao());
		assertEquals ("Conexão postgre", licao.getProblema());	
		assertEquals ("Corrigir url do banco", licao.getSolucao());				
	}

	@Test
	public void deveriaEditarLicoes(){
		Responsavel responsavel = new Responsavel();
		responsavel.setId(2);
		
		Licoes licao = new Licoes();
		
		licao.setId(1);
		licao.setResponsavel(responsavel);
		licao.setTitulo("Persistencia");
		licao.setEtapa(2);
		licao.setDataLicao(LocalDate.of(2015, Month.APRIL, 12));
		licao.setProblema("Conexao MySQL");
		licao.setSolucao("Configurar usuario e senha do banco");		
		
		JPALicoesDAO licaoDAO = new JPALicoesDAO();
		licaoDAO.altera(licao);

		assertEquals (1, licao.getResponsavel().getId());
		assertEquals ("Persistencia", licao.getTitulo());
		assertEquals (2, licao.getEtapa());
		assertEquals (LocalDate.of(2015, Month.APRIL, 12), licao.getDataLicao());
		assertEquals ("Conexão MySQL", licao.getProblema());	
		assertEquals ("Configurar usuario e senha do banco", licao.getSolucao());	
	}	

	@Test
	public void deveriaListarLicoes(){
		JPALicoesDAO licaoDAO = new JPALicoesDAO();
		List<Licoes> licoes = licaoDAO.lista();
		for (Licoes licao : licoes) {
			System.out.println(licao.getTitulo());			
		}
	}	
	
	@Test
	public void deveriaDeletarLicoes(){
		JPALicoesDAO licaoDAO = new JPALicoesDAO();
		Licoes licao = licaoDAO.buscaPorId(1);		
		licaoDAO.remove(licao);				
	}		
	
}
