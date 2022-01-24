package projeto;

public class Geometria {
	public double calcularDistancia(int xA, int xB, int yA, int yB) {
		return Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
	}
	
	public double areaQuadrado(int lado) {
		return Math.pow(lado, 2);
	}
	
	public double areaCircunferencia(int raio) {
		return Math.PI * Math.pow(raio, 2);
	}
	
	
	public double calcularHipotenusaTrianguloRetangulo(int catetoOposto, int catetoAdjacente) {
		return Math.sqrt( Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
	}
}
