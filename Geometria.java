public class Geometria {
	
	public static final double PI = 3.1416;
	
	public static double calcularAreaCuadrado (double lado) {
		
		return lado * lado;
		
	}
	
	public static double calcularAreaRectangulo (double base, double altura) {
		
		return base * altura;
		
	}
	
	public static double calcularAreaTriangulo (double base, double altura) {
		
		return (base * altura)/2.0;
		
	}
	
	public static double calcularAreaCirculo (double radio) {
		
		return radio * radio * PI;
		
	}
}


