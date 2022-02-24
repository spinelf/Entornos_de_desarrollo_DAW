package ed_calculadora;

/**
 * Esta clase implementar� todos los m�todos que est�n relacionados con la sumas de la calculadora.
 * <br>
 * Esta clase tendr� los siguientes metodos:
 * <br>
 * <b>Suma dos n�meros reales.</b>
 * <br>
 * <b>Suma dos n�meros enteros.</b>
 * <br>
 * <b>Suma tres n�meros reales.</b>
 * <br>
 * <b>Suma acumulada.</b>
 * <br>
 * 
 * <ul>
 * 
 * 
 * @authors Benjamin Ruiz de Casas, Diego Garc�a Rodriguez, Silvia Pi�el Fa�anas.
 * @version 2.0
 *
 */

public class Sumar {
	private double num1r;
	  private double num2r;
	  private double num3r;
	  private int num1e;
	  private int num2e;
	  
	  public static double Acumulador = 0; 
	  
	  
	  public Sumar (double num1r, double num2r) {
		  this.num1r = num1r;
		  this.num2r = num2r;
		  
	  }
	  public Sumar (int num1e, int num2e) {
		  this.num1e = num1e;
		  this.num2e = num2e;
	  }
	  public Sumar (double num1r, double num2r, double num3r) {
		  this.num1r = num1r;
		  this.num2r = num2r;
		  this.num3r = num3r;
		  
	  }
	  public Sumar (double Acumulador) {
		  this.Acumulador = Acumulador;
	  }
	  public double getNum1r() {
		  return num1r;
	  }
	  public void setNum1r() {
	  }
	  public double getNum2r() {
		  return num2r;
	  }
	  public void setNum2r() {
		  
	  }
	  public double getNum3r() {
		  return num3r;
	  }
	  public void setNum3r() {
		  
	  }
	  public int getNum1e() {
		  return num1e;
	  }
	  public void setNum1e() {
		  
	  }
	  public int getNum2e() {
		  return num2e;
	  }
	  public void setNum2e() {
		  
	  }
	  public double getAcumulador() {
		  return Acumulador;
	  }
	  public void setAcumulador() {
		  
	  }
	/**
	 * Este metodo suma dos n�meros reales.
	 * 
	 * @param num1r n�mero real que es el primer sumando.
	 * @param num2r n�mero real que es el segundo sumando.
	 * @return Devuelve un n�mero real que es la suma de ambos par�metros.
	 * 
	 * <b> Casos especiales:</b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que 
	 *   especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	 *   indicara el m�todo que debe ser un n�mero mayor o igual que cero.
	 * <br>
	 * - Cuando un <b>par�metro es 0</b> no ocurre nada especial.
	 * <br>
	 * 
	 * @author Benjamin Ruiz de Casas, Diego Garc�a Rodriguez, Silvia Pi�el Fa�anas.
	 * Se utiliza un acumulador para ir sumando los resultados 
	 *
	 */
		public double Suma_Reales () {
				  double Resultado = num1r + num2r;
				  Acumulador= Resultado + Acumulador;
				  return Math.round(Resultado*1000.0)/1000.0;
				}	
	/**
	 * Este metodo suma dos n�meros enteros.
	 * 
	 * Tiene dos par�metros de entrada:
	 * 
	 * @param num1e n�mero entero que es el primer sumando.
	 * @param num2e n�mero entero que es el segundo sumando.
	 *
	 * @return Devuelve un n�mero entero que es la suma de ambos par�metros.
	 * 
	 * <b> Casos especiales:</b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que 
	 *   especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	 *   indicara el m�todo que debe ser un n�mero mayor o igual que cero.
	 * <br>
	 * - Cuando un <b>par�metro es 0</b> no ocurre nada especial.
	 * <br>
	 * 
	 * 
	 * @author Benjamin Ruiz de Casas, Diego Garc�a Rodriguez, Silvia Pi�el Fa�anas.
	 */
		public int Suma_Enteros () {
			int Resultado = num1e + num2e;
			Acumulador = Resultado + Acumulador;
			return Resultado;
		}

	/**
	 * Este metodo suma tres n�meros reales.
	 * 
	 * Tiene tres par�metros de entrada:
	 * 
	 * @param num1r n�mero real que es el primer sumando.
	 * @param num2r n�mero real que es el segundo sumando.
	 * @param num2r n�mero real que es el tercer sumando.
	 * 
	 * @return Devuelve un n�mero real que es la suma de los tres par�metros.
	 * 
	 * <b> Casos especiales:</b>
	 * <br>
	 * - En el caso de que <b>no se admitieran n�meros negativos</b> habr�a que 
	 *   especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	 *   indicara el m�todo que debe ser un n�mero mayor o igual que cero.
	 * <br>
	 * - Cuando un <b>par�metro es 0</b> no ocurre nada especial.
	 * <br>
	 * 
	 * 
	 * @author Benjamin Ruiz de Casas, Diego Garc�a Rodriguez, Silvia Pi�el Fa�anas.
	 */
		public double Suma_Tres_Reales () {			
			double Resultado = num1r + num2r + num3r;
			Acumulador = Resultado + Acumulador;
			return Math.round(Resultado*1000.0)/1000.0;
		}

}

