public class TestGeometria {
	
	public static void main (String args[]) {
		
		double areaCuadrado = Geometria.calcularAreaCuadrado(2.123);
		System.out.println("Área del cuadrado de lado 2.123 vale: " + areaCuadrado);
		
		double areaRectangulo = Geometria.calcularAreaRectangulo(2.123, 1.233);
		System.out.println("Área del rectángulo de base 2.123 y de altura 1.233 vale: " + areaRectangulo);
		
		double areaTriangulo = Geometria.calcularAreaTriangulo(2.123, 1.233);
		System.out.println("Área del triangulo de base 2.123 y de altura 1.233 vale: " + areaTriangulo);
		
		double areaCirculo = Geometria.calcularAreaCirculo(2.123);
		System.out.println("Área del circulo de radio 2.123 vale: " + areaCirculo);
	
	}
}

