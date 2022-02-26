package junit5;

import calculadora.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Sumar;

class RestarTest {

	@Test
	public void TestRestar_real () {
		
		Restar Pruebareales1 = new Restar (10.5, 9.0);
		
		double resultadoEsperado = 1.5;
		double resultadoObtenido = Pruebareales1.Resta_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Restar Pruebareales2 = new Restar (0.0, 10.5);
		
		double resultadoEsperado2 = -10.5;
		double resultadoObtenido2 = Pruebareales2.Resta_Reales();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Restar Pruebareales3 = new Restar (16.2,-1.0);
		
		double resultadoEsperado3 = 17.2;
		double resultadoObtenido3 = Pruebareales3.Resta_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			}
	@Test
	public void TestResta_enteros () {
		
		Restar Pruebaenteros1 = new Restar (6, 4);
		
		int resultadoEsperado = 2;
		int resultadoObtenido = Pruebaenteros1.Resta_enteros();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Restar Pruebaenteros2 = new Restar (12, 0);
		
		int resultadoEsperado2 = 12;
		int resultadoObtenido2 = Pruebaenteros2.Resta_enteros();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Restar Pruebaenteros3 = new Restar (21,-6);
		
		int resultadoEsperado3 = 27;
		double resultadoObtenido3 = Pruebaenteros3.Resta_enteros();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			
	}
	@Test
	public void TestResta_real_tres () {
		
		Restar Pruebarealestres1 = new Restar (15.1, 12.1,1.0);
		
		double resultadoEsperado = 2.0;
		double resultadoObtenido = Pruebarealestres1.Resta_Tres_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Restar Pruebarealestres2 = new Restar (0.0, 10.5,1.0);
		
		double resultadoEsperado2 = -11.5;
		double resultadoObtenido2 = Pruebarealestres2.Resta_Tres_Reales();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Restar Pruebarealestres3 = new Restar (16.2,2.3,-1.0);
		
		double resultadoEsperado3 = 14.9;
		double resultadoObtenido3 = Pruebarealestres3.Resta_Tres_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			}

}
