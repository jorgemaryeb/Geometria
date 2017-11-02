/** Clase Geometria
 * la vamos a usar para realizar
 * diversos cálculos de geometría
 * @author Jorge
 * @version 1.0
*/

public class Geometria {
	
	public static final double PI = 3.1416;
	
	/** Método calcularAreaCuadrado
	 * que nos calcula el área de un cuadrado
	 * dado el lado
	 * @param lado de tipo double, lado que el lado que define al cuadrado 
	 * @return área del cuadrado, de tipo double
	*/	
	
	public static double calcularAreaCuadrado (double lado) {
		
		return lado * lado;
		
	}
	
	/** Método calcularAreaRectangulo
	 * que nos calcula el área de un rectángulo
	 * dada la base y la altura
	 * @param base de tipo double, base del rectángulo 
	 * @param altura de tipo double, base del rectángulo
	 * @return área del rectángulo, de tipo double
	*/
	
	public static double calcularAreaRectangulo (double base, double altura) {
		
		return base * altura;
		
	}
	
	/** Método calcularAreaTriángulo
	 * que nos calcula el área de un triángulo
	 * dada la base y la altura
	 * @param base de tipo double, base del triángulo 
	 * @param altura de tipo double, base del triángulo
	 * @return área del triángulo, de tipo double
	*/
	
	
	public static double calcularAreaTriangulo (double base, double altura) {
		
		return (base * altura)/2.0;
		
	}
	
	/** Método calcularAreaCirculo
	 * que nos calcula el área de un círculo
	 * dado el radio
	 * @param radio de tipo double, radio que define el círculo  
	 * @return área del círculo, de tipo double
	*/
	
	public static double calcularAreaCirculo (double radio) {
		
		return radio * radio * PI;
		
	}
}


