package ed_calculadora;

/**
 * Esta clase implementará todos los métodos que están relacionados con la resta de la calculadora.
 * <br>
 * Esta clase tendrá los siguientes atributos:
 * <br>
 * <b>Resta dos números reales.</b>
 * <br>
 * <b>Resta dos números enteros.</b>
 * <br>
 * <b>Resta tres números reales.</b>
 * <br>
 * <b>Resta acumulada</b>
 * <br>
 * <ul>
 * 
 * 
 * @authors Diego García Rodriguez
 * @version 2.0
 *
 */

  public class Restar {
	  
	  private double num1r;
	  private double num2r;
	  private double num3r;
	  private int num1e;
	  private int num2e;
	  
	  public static double Acumulador = 0;
	  
	 
	  
	  public Restar (double num1r, double num2r) {
		  this.num1r = num1r;
		  this.num2r = num2r;
		  
	  }
	  
	  public Restar (int num1e, int num2e) {
		  this.num1e = num1e;
		  this.num2e = num2e;
	  }
	  
	  public Restar (double num1r, double num2r, double num3r) {
		  this.num1r = num1r;
		  this.num2r = num2r;
		  this.num3r = num3r;
		  
	  }
	  public Restar (double Acumulador) {
		  this.Acumulador = Acumulador;
		  
	  }
	  
	  public double getAcumulador() {
		  return Acumulador;
	  }
	  public void setAcumulador() {
		  
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
	 
	 /** 
	  * Se crea el método para la resta de dos números reales.
	  * 
	  * @param num1r número real que es el minuendo.
	  * @param num2r número real que es el sustraendo.
	  * @return Devuelve el resultado de la resta.
	  * 
	  * Se utiliza un acumulador que irá sumando resultados.
	  * 
	  * <b> Casos especiales: </b>
	  * <br>
	  * - En el caso de que <b>no se admitieran números negativos</b> habría que 
	  *  especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	  *  indicara el método que debe ser un número mayor o igual que cero.
	  * <br>
	  * - Cuando un <b>parámetro es 0</b> no ocurre nada especial.
	  * <br>
	  * <ul>
	  */
	  
	
	    public double Resta_Reales () {
		  double Resultado = num1r - num2r;
		  Acumulador = Resultado + Acumulador;
		  return Resultado;
		}
	  
	/**
	 * Se crea un método para la resta de números enteros.
	 * 
	 * @param num1e número entero que es el minuendo.
	 * @param  num1e número entero que es el sustraendo.
	 * @return Devuelve el resultado de la resta. 
	 * Se utiliza un acumulador que irá sumando los resultados-
	 * 
	 * <b> Casos especiales: </b>
	 * <br>
	 * - En el caso de que <b>no se admitieran números negativos</b> habría que 
	 *  especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	 *  indicara el método que debe ser un número mayor o igual que cero.
	 * <br>
	 * - Cuando un <b>parámetro es 0</b> no ocurre nada especial.
	 * <br>
	 * <ul>
	 * 
	 */
		
	    public int Resta_enteros () {
			int Resultado = num1e - num2e;
			Acumulador = Resultado + Acumulador;
			return Resultado;
		}
		
	/**
	 * Se crea un método para la resta de tres números reales.
	 * 
	 * @param num1r número real que es el minuendo.
	 * @param num2r número real que es el sustraendo.
	 * @param num3r número real que es el sustraendo.
	 * @return Devuelve el el resultado de la resta.
	 * Se añade el acumulador que irá sumando los resultados.
	 * 
	 * <b> Casos especiales: </b>
	 * <br>
	 * - En el caso de que <b>no se admitieran números negativos</b> habría que 
	 *  especificarlo al usuario y ademas utilizar un if para en el caso de que lo pusiera le
	 *  indicara el método que debe ser un número mayor o igual que cero.
	 * <br>
	 * - Cuando un <b>parámetro es 0</b> no ocurre nada especial.
	 * <br>
	 * <ul>
	 */
		
		public double Resta_Tres_Reales () {
			double Resultado = num1r - num2r - num3r;
			Acumulador = Resultado + Acumulador;
			return Resultado;
		}
		
	}
