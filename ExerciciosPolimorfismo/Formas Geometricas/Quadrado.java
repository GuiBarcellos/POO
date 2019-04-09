
public class Quadrado extends FiguraGeometrica{

	double lado;
	
	/**
	 * Construtor cria um novo quadrado. Caracteristicas da super classe(FiguraGeometrica) + caracteristicas quadrado.
	 */
	public Quadrado(String cor, boolean filled, double lado){
		this.cor = cor;
		this.filled = filled;
		
		this.lado = lado;
	}

	/**
	 * Retorna lado do quadrado(double). 
	*/
	public double getLado() {
		return lado;
	}
	
	/**
	 * Seta lado do quadrado. 
	*/
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	/**
	 * Calcula area do Quadrado(lado*lado).
	 * @return area(double).
	 */
	public double calculaArea(){
		return lado*lado;
	}
	
	/**
	 * Calcula perimetro do Quadrado(4* lados).
	 * @return perimetro(double).
	 */
	public double calculaPerimetro(){
		return (4 * lado);
	}
}
