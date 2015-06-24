package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class ProvaTest {


	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(0.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
		
		
	}
	
	@Test
	public void testProvaMaiorQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
	}
	
	@Test
	public void testTotalDasProvas(){
		Prova p1 = new Prova();
		p1.setNota_max(25);
				
		Prova p2 = new Prova();
		p2.setNota_max(25);
				
		Prova p3 = new Prova();
		p3.setNota_max(50);
				
		Boletim boletim = new Boletim();
		boletim.adicionaProva(p1);
		boletim.adicionaProva(p2);
		boletim.adicionaProva(p3);
		
		double atual = 100;
		double esperado = boletim.somaDasProvas();
		
		assertEquals(esperado, atual, 0.0);
		
	}
	@Test
	public void testNotaFinal(){
		
		
	
		Prova p1 = new Prova();
		p1.setNota_max(25);
		p1.setNota_obtida(18);
		
		
		Prova p2 = new Prova();
		p2.setNota_max(25);
		p2.setNota_obtida(20);
		
		Prova p3 = new Prova();
		p3.setNota_max(50);
		p3.setNota_obtida(32);
		
		Boletim boletim = new Boletim();
		boletim.adicionaProva(p1);
		boletim.adicionaProva(p2);
		boletim.adicionaProva(p3);
		
		double atual = 70;
		double esperado = boletim.getNotaFinal();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	@Test
	public void testResultadoFinal(){
		Boletim b = new Boletim();
		Prova p1 = new Prova();
		p1.setNota_max(100);
		p1.setNota_obtida(70);
		b.adicionaProva(p1);
		
		boolean atual = true;
		boolean esperado = b.foiAprovado();
		
		assertEquals(esperado, atual);
	}
	
	
	@Test
	public void testAlunoReprovado(){
		Boletim b = new Boletim();
		Prova p1 = new Prova();
		p1.setNota_max(100);
		p1.setNota_obtida(50);
		b.adicionaProva(p1);
		
		boolean atual = false;
		boolean esperado = b.foiAprovado();
		
		assertEquals(esperado, atual);
	}
	
	@Test
	public void testNotaObtida_notaMax(){
		Prova p1 = new Prova();
		p1.setNota_max(25);
		p1.setNota_obtida(30);
		
		double atual = 0.0;
		double esperado = p1.getNota_obtida();
		
		assertEquals(esperado, atual, 0.0);
	}
	
	
	

}