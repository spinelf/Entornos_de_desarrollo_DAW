package ed_calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
 * <br>
 * Esta clase tendrá los siguientes métodos:
 * <br>
 * <b>Producto dos números reales.</b>.
 * <br>
 * <b>Producto dos números enteros.</b>
 * <br>
 * <b>Producto de tres números reales.</b>
 * <br>
 * <b>Potencia.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitierán números negativos</b> habría que especificarlo al usuario 
 *   y además utilizar un if para en el caso de que lo pusiera le indicara el método que debe ser 
 *   un número mayor o igual que cero.
 * <br>
 * - En el producto <b>no pasaría nada sí </b>alguno de los parámetros fuera <b>cero</b>.
 * <br>
 * - En la potencia:
 * 		1) La base es cero, el resultado es cero.
 * 		2) Si el exponente es cero el resultado es uno.
 *      3) Si <b>ambos son cero</b> sería una <b>indeterminación</b>.
 * <br>
 * - La entrada de <b>números muy grandes en la potencia </b> puede ser un problema a la hora de devolver el resultado, 
 *   para solucionarlo, utilizaremos un while que cuando el resultado tenga más de 7 cifras, la calculadora 
 *   muestre el número empleando la <b>notación científica</b> con la forma aEb, donde a sería el número y b el exponente 
 *   de la base 10.
 * <br>
 * <ul>
 * 
 * 
 * @authors Benjamin Ruiz de Casas
 * @version 2.0
 *
 */

public class Producto {
	private double num1r;
	private double num2r;
	private double num3r;
	private int num1e;
	private int num2e;
    
	
	public Producto (double num1r, double num2r) {
		
		this.num1r = num1r;
		this.num2r = num2r;
		
	}
	
	public Producto (int num1e, int num2e) {
	this.num1e = num1e;
	this.num2e = num2e;
	
	}
	
	public Producto (double num1r, double num2r, double num3r) {
		this.num1r = num1r;
		this.num2r = num2r;
		this.num3r = num3r;
		}
	
		
	public double getNum1r() {
		return num1r;
	}

	public void setNum1r(double num1r) {
		this.num1r = num1r;
	}

	public double getNum2r() {
		return num2r;
	}

	public void setNum2r(double num2r) {
		this.num2r = num2r;
	}
	public double getNum3r() {
		return num3r;
	}

	public void setNum3r(double num3r) {
		this.num3r = num3r;
	}
	public int getNum1e() {
		return num1e;
	}

	public void setNum1e(int num1e) {
		this.num1e = num1e;
	}

	public int getNum2e() {
		return num2e;
	}

	public void setNum2e(int num2e) {
		this.num2e = num2e;
	}
	
	/**
	 * Se crea el método para calcular el producto de dos números reales.
	 * Añado el método Math.round para no permitir más de tres cifras decimales en el resultado
	 * 
	 * @param num1r número real que es uno de los factores.
	 * @param num2r número real que es otro de los factores.
	 * @return Devuelve el resultado del producto.
	 */

	public double Producto_real () {
		double Resultado = num1r*num2r;
		return Math.round(Resultado*1000.0)/1000.0;
	}

	/**
	 * Se crea el método para calcular el producto de dos números enteros.
	 * 
	 * @param num1e número entero que es uno de los factores.
	 * @param num2e número entero que es otro de los factores.
	 * @return Devuelve el resultado del producto de ambos factores.
	 */
	public int Producto_entero () {
		int Resultado = num1e*num2e;
		return Resultado;	
	}

	/**
	 * Se crea el método para calcular el producto de tres números reales.
	 * Añado el método Math.round para no permitir más de tres cifras decimales en el resultado
	 * 
	 * @param num1r número real que es el factor uno.
	 * @param num2r número real que es el factor dos.
	 * @param num3r número real que es el factor tres.
	 * @return Devuelve el resultado del producto de los tres factores.
	 */
	public double Producto_triple () {
		double Resultado = num1r*num2r*num3r;
		return Math.round(Resultado*1000.0)/1000.0;	
	}

	/**
	 * Se crea el método para calcular la potencia de un número.
	 * 
	 * @param num1e número entero que representa la base de la potencia.
	 * @param num2e número entero que representa el exponente de la potencia.
	 * 
	 * @throws - La base y el exponente no pueden ser cero simultáneamente.
	 * 
	 * @return Devuelve el resultado de la potencia.
	 */
	public double Potencia () {
		double Resultado = Math.pow(num1e, num2e);
		return Resultado;
	}
}
