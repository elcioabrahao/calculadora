package br.usjt.parades.calculadora.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.usjt.parades.calculadora.Calculadora;

public class TesteCalculadora {

	public double n1, n2;
	Calculadora calculadora;

	public TesteCalculadora() {

	}

	@Before
	public void preparaTest() {
		this.n1 = 5.5;
		this.n2 = 4.5;
		calculadora = new Calculadora();
	}
	
	
	@Test
	public void testaConstrutor() {
		Calculadora cal = new Calculadora(1.1d,2.2d);
		assertEquals(1.1d,cal.n1,0.001);
		assertEquals(2.2d,cal.n2,0.001);
	}

	@Test
	public void testAdicao() {
		assertEquals(10.0, calculadora.adiciona(n1, n2), 0.001);
	}
	
	@Test
	public void testAdicaoInt() {
		assertEquals(10, calculadora.adicionaI(6, 4));
	}
	
	@Test
	public void testSub() {
		assertEquals(1.0, calculadora.subtrai(n1, n2), 0.001);
	}
	
	@Test
	public void testSubInt() {
		assertEquals(2, calculadora.subtraiI(6, 4));
	}

	@Test
	public void testMult() {
		assertEquals(24.75, calculadora.multiplica(n1, n2), 0.001);
	}
	
	@Test
	public void testMultInt() {
		assertEquals(24, calculadora.multiplicaI(6, 4));
	}

	@Test
	public void testDiv() {
		assertEquals(1.222, calculadora.divide(n1, n2), 0.001);
	}
	
	@Test
	public void testDivInt() {
		assertEquals(2, calculadora.divideI(10, 5));
	}

	@Test
	public void testaCalcula() {
		
		calculadora.n1=5.5;
		calculadora.n2=4.5;
		
		
		assertEquals(10.0d, calculadora.calcula('+'),0.001);
		assertEquals(1.0d, calculadora.calcula('-'),0.001);
		assertEquals(24.75d,calculadora.calcula('*'),0.001);
		assertEquals(1.222d, calculadora.calcula('/'),0.001);
		assertEquals(0.0d, calculadora.calcula('b'),0.001);
		
		
	}
	
	

}