package ed_calculadora;


/**
 * En el main llamaremos a los ditintos métodod para realizar las distintas operaciones
 * con la calculadora 
 * 
 * <br>
 * En esta clase realizaremos las siguientes operaciones:
 * <br>
 * <b>Sumas.</b>
 * <br>
 * <b>Restas.</b>
 * <br>
 * <b>Productos.</b>
 * <br>
 * <b>Cocientes.</b>
 * <br>
 * <ul>
 * 
 * 
 * @authors Benjamin Ruiz de Casas, Diego García Rodriguez, Silvia Piñel Fañanas.
 * @version 2.0
 *
 */
public class Main {

	public static void main(String[] args) {
		
		
		// Cálculo de la suma de dos números reales
		
			Sumar Sum1 = new Sumar (4.2,2.2);
		
		// Cálculo de la suma de dos números enterosÇ
			
			Sumar Sum2 = new Sumar (4,2);
		
		// Cálculo de la suma de tres números enteros
		
			Sumar Sum3 =new Sumar (2.3, 1.5, 2.4);
		
				
		System.out.println ("MÉTODOS DE LA SUMA-------------------------------------");
		System.out.println("El resultado de la suma de " + Sum1.getNum1r() + " y " + Sum1.getNum2r() + " es: " + Sum1.Suma_Reales ());
		System.out.println("El resultado de la suma de " + Sum2.getNum1e() + " y " + Sum2.getNum2e() + " es: " + Sum2.Suma_Enteros ());
		System.out.println("El resultado de la suma de " + Sum3.getNum1r() + ", " + Sum3.getNum2r() + " y " + Sum3.getNum3r() + " es: " + Sum3.Suma_Tres_Reales ());
		System.out.println("El resultado del acumulador de sumas es " + Sumar.Acumulador);
		System.out.println(" ");
		
		// Cálculo de la resta de dos números reales
		
		Restar Res1 = new Restar (4.2,2.2);
		
	    // Cálculo de la suma de dos números enteros
		
		Restar Res2 = new Restar (4,2);
		
		//Cálculo de la suma de tres números enteros
		
		Restar Res3 =new Restar (2.3, 1.5, 2.4);
		
				
		System.out.println ("MÉTODOS DE LA RESTA-------------------------------------");
		System.out.println("El resultado de la resta de " + Sum1.getNum1r() + " y " + Sum1.getNum2r() + " es: " + Sum1.Suma_Reales ());
		System.out.println("El resultado de la resta de " + Sum2.getNum1e() + " y " + Sum2.getNum2e() + " es: " + Sum2.Suma_Enteros ());
		System.out.println("El resultado de la resta de " + Sum3.getNum1r() + ", " + Sum3.getNum2r() + " y " + Sum3.getNum3r() + " es: " + Sum3.Suma_Tres_Reales ());
		System.out.println("El resultado del acumulador de las restas es " + Restar.Acumulador);
		System.out.println(" ");
		
		// Cálculo del producto de dos números reales.
		
			Producto Pro1 = new Producto (4.2,2.2);
		
		// Cálculo del producto de dos números enteros.
			Producto Pro2 = new Producto (4,2);
		
		// Cálculo del producto de tres números enteros.
		
			Producto Pro3 =new Producto (2.3, 1.5, 2.4);
		
				
		// Cálculo de la potencia.
		
			Producto Pro4 =new Producto (2,3);

		System.out.println ("MÉTODOS DEL PRODUCTO-------------------------------------");
		System.out.println("el resultado del producto de " + Pro1.getNum1r() + " y " + Pro1.getNum2r() + " es: " + Pro1.Producto_real());
		System.out.println("el resultado del producto de " + Pro2.getNum1e() + " y " + Pro2.getNum2e() + " es: " + Pro2.Producto_entero());
		System.out.println("el resultado del producto de " + Pro3.getNum1r() + ", " + Pro3.getNum2r() + " y " + Pro3.getNum3r() + " es: " + Pro3.Producto_triple());
		System.out.println("el resultado de elevar " + Pro4.getNum1e() + " a " + Pro4.getNum2e()+ " es: " + Pro4.Potencia());
		System.out.println(" ");
		
		// Cálculo del cociente de dos números reales
		
				Cociente Div1 = new Cociente (4.2,2.2);
				
		// Cálculo del cociente de dos números enteros
				
				Cociente Div2 = new Cociente (4,2);
				
		// Cálculo del inverso
				
				Cociente Inver1 =new Cociente (2.3);
				
						
		// Cálculo de la raíz cuadrada
				
				Cociente Raiz1 =new Cociente (2.3);
				
				
		System.out.println ("MÉTODOS DEL COCIENTE-------------------------------------");
		System.out.println("El resultado del cociente de " + Div1.getNum1r() + " y " + Div1.getNum2r() + " es: " + Div1.Division_double());
		System.out.println("El resultado del cociente de " + Div2.getNum1e() + " y " + Div2.getNum2e() + " es: " + Div2.Division_int());
		System.out.println("El resultado del inverso de " + Inver1.getNum1r() + " es: " + Inver1.Inverso());
		System.out.println("El resultado de la raiz cuadrada " + Raiz1.getNum1r() + " es: " + Raiz1.Raiz());
		System.out.println(" ");

				
	   	}

}
