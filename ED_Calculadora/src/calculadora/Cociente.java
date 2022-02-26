package calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la divisi�n de la calculadora.
 * <br>
 * En esta clase realizaremos las siguientes operaciones:
 * <br>
 * <b>Divisi�n de dos n�meros reales.</b>
 * <br>
 * <b>Divisi�n de dos n�meros enteros.</b>
 * <br>
 * <b>Inverso de un n�mero real.</b>
 * <br>
 * <b>Ra�z de un n�mero.</b>
 * <br>
 * <ul>
 * 
 * 
 * @authors Silvia Pi�el Fa�an�s
 * @version 2.0
 *
 */

public class Cociente {
	private double num1r;
	private double num2r;
	private int num1e;
	private int num2e;
    
	
	public Cociente(double num1r, double num2r) {
		
		this.num1r = num1r;
		this.num2r = num2r;
		
	}
	
	public Cociente (int num1e, int num2e) {
	this.num1e = num1e;
	this.num2e = num2e;
	
	}
	
	public Cociente (double num1r) {
		this.num1r = num1r;
		
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
	 * Este m�todo divide dos n�meros reales.
	 * 
	 * @param num1r es un m�mero real que ser� el dividendo. 
	 * @param num2r es un m�mero real que ser� el divisor.
	 * @return Devuelve un n�mero real que es el cociente de ambos par�metros.
	 * @throws ArithmeticException Si num2r es <b>cero</b>, ya que no se puede dividir entre cero (indeterminaci�n)
	 * 
	 * <br>
	 * <b> Casos especiales: </b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que especificarlo al usuario 
	 *   y ademas utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser un 
	 *   n�mero mayor o igual que cero.
	 *   <br>
	 * - <b>No es posible dividir un n�mero entre 0 </b> por lo que solo se admitiria en el numerador.
	 *
	 * <ul>
	 * 
	 * 
	 * @author Silvia Pi�el Fa�an�s
	 */
		public double Division_double () { 
			
		double resultado;
		resultado = num1r/num2r;
		return Math.round(resultado*1000.0)/1000.0;
		}
	
	/**
	 * Este m�todo divide dos n�meros enteros.
	 * 
	 * Tiene dos par�metros de entrada:
	 * 
	 * @param num1e es un m�mero entero que ser� el dividendo. 
	 * @param num2e es un m�mero entero que ser� el divisor.
	 *
	 * @return Devuelve un n�mero entero que es el cociente de ambos par�metros.
	 * @throws ArithmeticException Si num2e es <b>cero</b>, ya que no se puede dividir entre cero (indeterminaci�n).
	 * 
	 * <br>
	 * <b> Casos especiales: </b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que especificarlo al usuario 
	 *   y ademas utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser un 
	 *   n�mero mayor o igual que cero.
	 * <br>
	 * - <b>No es posible dividir un n�mero entre 0 </b> por lo que solo se admitiria en el numerador.
	 * - Cuando la divisi�n no es exacta como queremos obtener decimales al hacer la divisi�n, introduciremos
	 *   una conversi�n para pasar los parametros int a double y de esta forma obtener los decimales.
	 * <br>
	 * 		Ejem:
	 * 			System.out.println((double) 10 / 9);
	 * <ul>
	 * @author Silvia Pi�el Fa�an�s
	 */
		public int Division_int () 
			{
			int resultado;
			resultado = num1e/num2e;
			return resultado;
		    
			}

	/**
	 * Este metodo calcula en inverso de un n�mero real.
	 * 
	 * Tiene un par�metros de entrada:
	 * 
	 * @param num1r es un n�mero real del que vamos a calcular el inverso.
	 * 
	 * @return Devuelve el inverso del n�mero introducido como par�metro.
	 * 
	 * @throws ArithmeticException Si num1r es <b>cero</b>, ya que no se puede dividir entre cero (indeterminaci�n).
	 * 
	 * <br>
	 * <b> Casos especiales: </b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que especificarlo al usuario 
	 *   y ademas utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser un 
	 *   n�mero mayor o igual que cero.
	 *   <br>
	 * - <b>No es posible dividir un n�mero entre 0 </b> por lo que solo se admitiria en el numerador.
	 * <ul>
	 * 
	 * @author Silvia Pi�el Fa�an�s
	 */
		public double Inverso () 
			{
				
			double resultado;
			resultado = 1/num1r;
			return Math.round(resultado*1000.0)/1000.0;
			}
		/**
		 * Este metodo calcula la ra�z de un n�mero.
		 * 
		 * Tiene un par�metro de entrada:
		 * 
		 * @param num1r es un n�mero real del que vamos a calcular la ra�z cuadrada.
		 * 
		 * @return Devuelve la ra�z cuadrada del n�mero introducido.
		 * 
		 * 
		 * <br>
		 * <b> Casos especiales: </b>
		 * <br>
		 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que especificarlo al usuario 
		 *   y ademas utilizar un if para en el caso de que lo pusiera le indicara el m�todo que debe ser un 
		 *   n�mero mayor o igual que cero.
		 * - El resultado ser� NaN si el par�metro facilitado es negativo.
		 * 
		 * <br>
		 * <ul>
		 * 
		 * 
		 * @author Silvia Pi�el Fa�an�s
		 */
		public double Raiz () 
			{
			double resultado;
			resultado= Math.sqrt(num1r);
			return Math.round(resultado*1000.0)/1000.0;
			}

}

