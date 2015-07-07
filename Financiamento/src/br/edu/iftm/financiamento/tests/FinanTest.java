package br.edu.iftm.financiamento.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.iftm.financiamento.veiculo;

public class FinanTest {

	@Test
	public void test() {
		veiculo V1 = new veiculo(30000,10000,2,48,3000);
		
		double valor= 652;
		double esperado = V1.financiamento();
		
		assertEquals (valor,esperado ,15);
  }
	
}