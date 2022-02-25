package calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la multiplicaci�n de la calculadora.
 * <br>
 * Esta clase tendr� los siguientes m�todos:
 * <br>
 * <b>Producto dos n�meros reales.</b>.
 * <br>
 * <b>Producto dos n�meros enteros.</b>
 * <br>
 * <b>Producto de tres n�meros reales.</b>
 * <br>
 * <b>Potencia.</b>
 * <br>
 * <br>
 * <b> Casos especiales: </b>
 * <br>
 * - En el caso de que <b>no se admitier�n n�meros negativos</b> habr�a que especificarlo al usuario 
 *   y adem�s utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser 
 *   un n�mero mayor o igual que cero.
 * <br>
 * - En el producto <b>no pasar�a nada s� </b>alguno de los par�metros fuera <b>cero</b>.
 * <br>
 * - En la potencia:
 * 		1) La base es cero, el resultado es cero.
 * 		2) Si el exponente es cero el resultado es uno.
 *      3) Si <b>ambos son cero</b> ser�a una <b>indeterminaci�n</b>.
 * <br>
 * - La entrada de <b>n�meros muy grandes en la potencia </b> puede ser un problema a la hora de devolver el resultado, 
 *   para solucionarlo, utilizaremos un while que cuando el resultado tenga m�s de 7 cifras, la calculadora 
 *   muestre el n�mero empleando la <b>notaci�n cient�fica</b> con la forma aEb, donde a ser�a el n�mero y b el exponente 
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
	 * Se crea el m�todo para calcular el producto de dos n�meros reales.
	 * A�ado el m�todo Math.round para no permitir m�s de tres cifras decimales en el resultado
	 * 
	 * @param num1r n�mero real que es uno de los factores.
	 * @param num2r n�mero real que es otro de los factores.
	 * @return Devuelve el resultado del producto.
	 */

	public double Producto_real () {
		double Resultado = num1r*num2r;
		return Math.round(Resultado*1000.0)/1000.0;
	}

	/**
	 * Se crea el m�todo para calcular el producto de dos n�meros enteros.
	 * 
	 * @param num1e n�mero entero que es uno de los factores.
	 * @param num2e n�mero entero que es otro de los factores.
	 * @return Devuelve el resultado del producto de ambos factores.
	 */
	public int Producto_entero () {
		int Resultado = num1e*num2e;
		return Resultado;	
	}

	/**
	 * Se crea el m�todo para calcular el producto de tres n�meros reales.
	 * A�ado el m�todo Math.round para no permitir m�s de tres cifras decimales en el resultado
	 * 
	 * @param num1r n�mero real que es el factor uno.
	 * @param num2r n�mero real que es el factor dos.
	 * @param num3r n�mero real que es el factor tres.
	 * @return Devuelve el resultado del producto de los tres factores.
	 */
	public double Producto_triple () {
		double Resultado = num1r*num2r*num3r;
		return Math.round(Resultado*1000.0)/1000.0;	
	}

	/**
	 * Se crea el m�todo para calcular la potencia de un n�mero.
	 * 
	 * @param num1e n�mero entero que representa la base de la potencia.
	 * @param num2e n�mero entero que representa el exponente de la potencia.
	 * 
	 * @throws - La base y el exponente no pueden ser cero simult�neamente.
	 * 
	 * @return Devuelve el resultado de la potencia.
	 */
	public double Potencia () {
		double Resultado = Math.pow(num1e, num2e);
		return Resultado;
	}
}
