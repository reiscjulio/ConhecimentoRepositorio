package br.com.lti.teste;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

import br.com.lti.modelo.Atividade;

public class AtividadeTeste {
	@Test
	public void deveriaCriarAtividade()
	{
		Atividade atividade = new Atividade();
		
		atividade.setTitulo("Titulo");
		atividade.setData_inicio(LocalDate.of(2015, Month.MARCH, 5));
		atividade.setData_conclusao(LocalDate.of(2015, Month.DECEMBER, 4));
		atividade.setResumo("Resumo");
		
		assertEquals("Titulo", atividade.getTitulo());
		assertEquals(LocalDate.of(2015, Month.MARCH, 5), atividade.getData_inicio());
		assertEquals(LocalDate.of(2015, Month.DECEMBER, 4), atividade.getData_conclusao());
		assertEquals("Resumo", atividade.getResumo());
	}
	
	@Test
	public void deveriaEditarAtividade()
	{
		Atividade atividade = new Atividade();
		
		atividade.setTitulo("Estágio");
		atividade.setData_inicio(LocalDate.of(2015, Month.MAY, 10));
		atividade.setData_conclusao(LocalDate.of(2015, Month.DECEMBER, 4));
		atividade.setResumo("Resumo");
		
		assertEquals("Estágio", atividade.getTitulo());
		assertEquals(LocalDate.of(2015, Month.MAY, 10), atividade.getData_inicio());
		assertEquals(LocalDate.of(2015, Month.DECEMBER, 4), atividade.getData_conclusao());
		assertEquals("Resumo", atividade.getResumo());
	}
	
//	@Test
//	public void deveriaListarAtividade()
//	{
//		JPAAtividadeDAO atividadeDAO = new JPAAtividadeDAO();
//		List<Atividade> atividade = AtividadeDAO.lista();
//		for (Atividade atividade : atividade) {
//			System.out.println(atividade.getTitulo());			
//		}
//	}
//	
//	@Test
//	public void deveriaDeletarAtividade()
//	{
//		JPAAtividadeDAO atividadeDAO = new JPAAtividadeDAO();
//		Atividade atividade = AtividadeDAO.buscaPorId(1);
//		atividadeDAO.remove(atividade);
//	}
}
