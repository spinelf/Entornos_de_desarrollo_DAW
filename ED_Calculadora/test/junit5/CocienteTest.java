package junit5;

import calculadora.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CocienteTest {

	@Test
	public void TestCociente_int () {
		Cociente Prueba1int = new Cociente (10, 5);
		
		int resultadoEsperado = 2;
		int resultadoObtenido = Prueba1int.Division_int();
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Cociente Prueba2int = new Cociente (5, 10);
		
		int resultadoEsperado2int = 0;
		int resultadoObtenido2int = Prueba2int.Division_int();
		
		assertEquals (resultadoEsperado2int, resultadoObtenido2int);
		
		Cociente Prueba3int = new Cociente (10,-1);
		
		int resultadoEsperado3int = -10;
		int resultadoObtenido3int = Prueba3int.Division_int();
		
		assertEquals (resultadoEsperado3int, resultadoObtenido3int);
		
		//en este caso el método debería lanzar una excepción, aún no sabemos hacerlo, así que dejo la prueba como comentario 
		//Cociente Prueba4int = new Cociente (5, 0);
		
		//int resultadoEsperado4int = 0;
		//int resultadoObtenido4int = Prueba4int.Division_int();
		
		//assertEquals (resultadoEsperado4int, resultadoObtenido4int);
	}
	@Test
	public void TestCociente_double () {
		Cociente Prueba1double = new Cociente (20, 0.25);
		
		double resultadoEsperado = 80;
		double resultadoObtenido = Prueba1double.Division_double();
		
		
		assertEquals (resultadoEsperado, resultadoObtenido);
		
		Cociente Prueba2double = new Cociente (0.25, 20);
		
		double resultadoEsperado2double = 0.013; //ponemos este resultado porque está redondeado a 3 cifras decimales
		double resultadoObtenido2double = Prueba2double.Division_double();
		
		assertEquals (resultadoEsperado2double, resultadoObtenido2double);
		
		Cociente Prueba3double = new Cociente (-0.25, 20);
		
		double resultadoEsperado3double = -0.012; //ponemos este resultado porque está redondeado a 3 cifras decimales
		double resultadoObtenido3double = Prueba3double.Division_double();
		
		assertEquals (resultadoEsperado3double, resultadoObtenido3double);
		
		//en este caso el método debería lanzar una excepción, aún no sabemos hacerlo, así que dejo la prueba como comentario 
		//Cociente Prueba4double = new Cociente (0.25, 0);
		
		//double resultadoEsperado4double = ; 
		//double resultadoObtenido4double = Prueba4double.Division_double();
		
		//assertEquals (resultadoEsperado4double, resultadoObtenido4double);	
	}
	@Test
	public void TestInverso () {
		Cociente PruebaInverso = new Cociente (4);
		
		double resultadoEsperadoInv = 0.25;
		double resultadoObtenidoInv = PruebaInverso.Inverso();
		
		assertEquals (resultadoEsperadoInv, resultadoObtenidoInv);
		
		Cociente Prueba2Inverso = new Cociente (-4);
		
		double resultadoEsperado2inv = -0.25;
		double resultadoObtenido2inv = Prueba2Inverso.Inverso();
		
		assertEquals (resultadoEsperado2inv, resultadoObtenido2inv);
		
		//en este caso el método debería lanzar una excepción, aún no sabemos hacerlo, así que dejo la prueba como comentario 
		//Cociente Prueba3Inverso = new Cociente (0);
		
		//double resultadoEsperado3inv = -0.25;
		//double resultadoObtenido3inv = Prueba2Inverso.Inverso();
		
		//assertEquals (resultadoEsperado3inv, resultadoObtenido3inv);
	}
	
	@Test
	public void TestRaiz () {
		Cociente PruebaRaiz = new Cociente (4);
		
		double resultadoEsperadoRaiz = 2;
		double resultadoObtenidoRaiz = PruebaRaiz.Raiz();
		
		assertEquals (resultadoEsperadoRaiz, resultadoObtenidoRaiz);
	
		Cociente Prueba2Raiz = new Cociente (0);
		
		double resultadoEsperadoRaiz2 = 0;
		double resultadoObtenidoRaiz2 = Prueba2Raiz.Raiz();
		
		assertEquals (resultadoEsperadoRaiz2, resultadoObtenidoRaiz2);
		
		//en este caso el método debería lanzar una excepción, aún no sabemos hacerlo, así que dejo la prueba como comentario 
		//Cociente Prueba3Raiz = new Cociente (-4);
		
		//double resultadoEsperadoRaiz3 = ;
		//double resultadoObtenidoRaiz3 = Prueba3Raiz.Raiz();
		
		//assertEquals (resultadoEsperadoRaiz3, resultadoObtenidoRaiz3);
	}
}
