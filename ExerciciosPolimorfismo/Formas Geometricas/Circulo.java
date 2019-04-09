
public class Circulo extends FiguraGeometrica {

	double raio;
	
	/**
	 * Construtor cria um novo circulo. Caracteristicas da super classe(FiguraGeometrica) + caracteristicas circulo.
	 */
	public Circulo(String cor, boolean filled, double raio){
		this.cor = cor;
		this.filled = filled;
		
		this.raio = raio;
	}
	
	/**
	 * Retorna raio do circulo(double).
	 */
	public double getRaio() {
		return raio;
	}
	
	/**
	 * Seta o raio do circulo.
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	/**
	 * Calcula area do Circulo(PI * raio * raio).
	 * @return area(double).
	 */
	public double calculaArea(){
		return (raio * raio * Math.PI);
	}
	
	/**
	 * Calcula perimetro do Circulo(2 * raio * PI).
	 * @return perimetro(double).
	 */
	public double calculaPerimetro(){
		return (2 * Math.PI * raio);
	}
}
