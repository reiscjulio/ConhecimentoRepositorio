package br.com.lti.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.lti.modelo.Relatorio;

public class RelatorioTeste {
	
	@Test
	public void deveriaCriarRelatorio()
	{
		Relatorio relatorio = new Relatorio();
		
		relatorio.setTipo_relatorio((byte) '1');
		
//		assertEquals((byte) '1', relatorio.getTipo_relatorio());
	}
	
	@Test
	public void deveriaEditarRelatorio()
	{
		Relatorio relatorio = new Relatorio();
		
		relatorio.setTipo_relatorio((byte) '2');
		
//		assertEquals((byte) '2', relatorio.getTipo_relatorio());
	}
	
//	@Test
//	public void deveriaListarRelatorio()
//	{
//		JPARelatorioDAO relatorioDAO = new JPARelatorioDAO();
//		List<Relatorio> relatorio = RelatorioDAO.lista();
//		for (Relatorio relatorio : relatorio) {
//			System.out.println(relatorio.getTipo_relatorio());			
//		}
//	}
//	
//	@Test
//	public void deveriaDeletarRelatorio()
//	{
//		JPARelatorioDAO relatorioDAO = new JPARelatorioDAO();
//		Relatorio relatorio = RelatorioDAO.buscaPorId(1);
//		projetosDAO.remove(relatorio);
//	}
}
