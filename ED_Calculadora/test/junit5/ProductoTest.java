package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Producto;

class ProductoTest {

	@Test
	public void ProductoTest_int () {
		
		Producto Prueba_1 = new Producto (3, 5);
		
		int resultadoEsperadoint = 15;
		int resultadoObtenidoint = Prueba_1.Producto_entero ();
		
		assertEquals (resultadoEsperadoint, resultadoObtenidoint);
		
		Producto Prueba_2 = new Producto (2,5);
		
		int resultadoEsperado_1_int = 10;
		int resultadoObtenido_1_int = Prueba_2.Producto_entero();
		
		assertEquals (resultadoEsperado_1_int, resultadoObtenido_1_int);
		
		Producto Prueba_3 = new Producto (-4, -5);
		
		int resultadoEsperado_2_int = 20;
		int resultadoObtenido_2_int = Prueba_3.Producto_entero();
		
		assertEquals (resultadoEsperado_2_int, resultadoObtenido_2_int);
		
		Producto Prueba_4 = new Producto (-5, 5);
		
		int resultadoEsperado_3_int = -25;
		int resultadoObtenido_3_int = Prueba_4.Producto_entero();
		
		assertEquals (resultadoEsperado_3_int, resultadoObtenido_3_int);
		
		Producto Prueba_5 = new Producto (6, 0);
		
		int resultadoEsperado_4_int = 0;
		int resultadoObtenido_4_int = Prueba_5.Producto_entero();
		assertEquals (resultadoEsperado_4_int, resultadoObtenido_4_int);
		
	}
	
	@Test 
	public void TestProducto_Double () {
		
		Producto Prueba_Double_1 = new Producto (4.2, 2.2);
		
		double resultadoEsperado_double = 9.24;
		double resultadoObtenido_double = Prueba_Double_1.Producto_real();
		
		assertEquals(resultadoEsperado_double, resultadoObtenido_double);
		
		Producto Prueba_Double_2 = new Producto (-10, 0.5);
		
		double resultadoEsperado_1_double = -5;
		double resultadoObtenido_1_double= Prueba_Double_2.Producto_real();
		
		assertEquals(resultadoEsperado_1_double, resultadoObtenido_1_double);
		
		Producto Prueba_Double_3 = new Producto (-10, -2.5);
		
		double resultadoEsperado_2_double = 25.0;
		double resultadoObtenido_2_double = Prueba_Double_3.Producto_real();
		
		assertEquals(resultadoEsperado_2_double,resultadoObtenido_2_double);
		
		Producto Prueba_Double_4 = new Producto (0, -2.5);
		
		double resultadoEsperado_4_double = 0;
		double resultadoObtenido_4_double = Prueba_Double_4.Producto_real();
		
		assertEquals(resultadoEsperado_4_double,resultadoObtenido_4_double);
	}
	
	public void TestProducto_triple () {
		Producto Prueba_Triple = new Producto (10, 0.1, 0.5);
		
		double resultadoEsperado_tresdouble = 0.5;
		double resultadoObtenido_tresdouble = Prueba_Triple.Producto_triple();
		
		assertEquals (resultadoEsperado_tresdouble,resultadoObtenido_tresdouble);
		
		Producto Prueba_Triple_1 = new Producto (-10, 0.5, 0.1);
		
		double resultadoEsperado_1_tresdouble = -0.5;
		double resultadoObtenido_1_tresdouble = Prueba_Triple_1.Producto_triple();
		 
		assertEquals (resultadoEsperado_1_tresdouble, resultadoObtenido_1_tresdouble);
		
		Producto Prueba_Triple_2 = new Producto (-10, -0.5, -1.1);
		
		double resultadoEsperado_2_tresdouble = -5.5;
		double resultadoObtenido_2_tresdouble = Prueba_Triple_2.Producto_triple();
		
		assertEquals (resultadoEsperado_2_tresdouble, resultadoObtenido_2_tresdouble);
		
		Producto Prueba_Triple_3 = new Producto (-10, 0.0, -1.1);
		
		double resultadoEsperado_3_tresdouble = 0;
		double resultadoObtenido_3_tresdouble = Prueba_Triple_3.Producto_triple();
		
		assertEquals (resultadoEsperado_3_tresdouble, resultadoObtenido_3_tresdouble);
		
	}
	
	@Test
	public void TestPotencia() {
		
		Producto Prueba_Potencia = new Producto (2,3);
		
		double resultadoEsperado_pot = 8.0;
		double resultadoObtenido_pot = Prueba_Potencia.Potencia();
		
		assertEquals (resultadoEsperado_pot, resultadoObtenido_pot);
		
		Producto Prueba_Potencia_1 = new Producto (10, 2);
		
		double resultadoEsperado_1_pot = 100.0;
		double resultadoObtenido_1_pot = Prueba_Potencia_1.Potencia();
		
		assertEquals (resultadoEsperado_1_pot, resultadoObtenido_1_pot);
		
		Producto Prueba_Potencia_2 = new Producto (3, 0);
		
		double resultadoEsperado_2_pot = 1.0;
		double resultadoObtenido_2_pot = Prueba_Potencia_2.Potencia();
		
		assertEquals (resultadoEsperado_2_pot, resultadoObtenido_2_pot);
		
	}


}
