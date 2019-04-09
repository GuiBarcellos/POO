
public class Retangulo extends FiguraGeometrica {

	double base;
	double altura;
	
	/**
	 * Construtor cria um novo retangulo. Caracteristicas da super classe(FiguraGeometrica) + caracteristicas retangulo.
	 */
	public Retangulo(String cor, boolean filled, double base, double altura){
		this.cor = cor;
		this.filled = filled;
		
		this.base = base;
		this.altura = altura;
	}

	/**
	 * Retorna base do retangulo(double). 
	*/
	public double getBase() {
		return base;
	}

	/**
	 * Seta base do retangulo. 
	*/
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Retorna altura do retangulo(double). 
	*/
	public double getAltura() {
		return altura;
	}

	/**
	 * Seta altura do retangulo. 
	*/
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	/**
	 * Calcula area do Retangulo(Base*Altura).
	 * @return area(double).
	 */
	public double calculaArea(){
		return base * altura;
	}
	
	/**
	 * Calcula perimetro do Retangulo(2 * Base + 2 * Altura).
	 * @return perimetro(double).
	 */
	public double calculaPerimetro(){
		return ((2 * base)+(2 * altura));
	}
	
	
}
