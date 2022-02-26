package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Sumar;

class SumaTest {

	@Test
	public void TestSuma_real () {
		
		Sumar Pruebareales1 = new Sumar (5.5, 12.0);
		
		double resultadoEsperado = 17.5;
		double resultadoObtenido = Pruebareales1.Suma_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Sumar Pruebareales2 = new Sumar (0.0, 10.5);
		
		double resultadoEsperado2 = 10.5;
		double resultadoObtenido2 = Pruebareales2.Suma_Reales();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Sumar Pruebareales3 = new Sumar (16.2,-1.0);
		
		double resultadoEsperado3 = -15.2;
		double resultadoObtenido3 = Pruebareales3.Suma_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			}
	@Test
	public void TestSuma_enteros () {
		
		Sumar Pruebaenteros1 = new Sumar (6, 4);
		
		int resultadoEsperado = 10;
		int resultadoObtenido = Pruebaenteros1.Suma_Enteros();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Sumar Pruebaenteros2 = new Sumar (12, 0);
		
		int resultadoEsperado2 = 12;
		int resultadoObtenido2 = Pruebaenteros2.Suma_Enteros();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Sumar Pruebaenteros3 = new Sumar (21,-6);
		
		int resultadoEsperado3 = 15;
		double resultadoObtenido3 = Pruebaenteros3.Suma_Enteros();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			
	}
	@Test
	public void TestSuma_real_tres () {
		
		Sumar Pruebarealestres1 = new Sumar (5.5, 12.0,15.2);
		
		double resultadoEsperado = 32.7;
		double resultadoObtenido = Pruebarealestres1.Suma_Tres_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Sumar Pruebarealestres2 = new Sumar (0.0, 10.5,1.0);
		
		double resultadoEsperado2 = 11.5;
		double resultadoObtenido2 = Pruebarealestres2.Suma_Tres_Reales();
		
		assertEquals (resultadoEsperado2, resultadoObtenido2);
		
		Sumar Pruebarealestres3 = new Sumar (16.2,2.3,-1.0);
		
		double resultadoEsperado3 = 17.5;
		double resultadoObtenido3 = Pruebarealestres3.Suma_Tres_Reales();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
			}
	
}


