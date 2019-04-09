
public class Main {
	
	public static void main(String[] args){
		
		Circulo c = new Circulo("azul", true, 4);
		
		double area = c.calculaArea();
		double perimetro = c.calculaPerimetro();
		
		System.out.println("Area do circulo: "+area);
		System.out.println("Perimetro do circulo: "+perimetro);
		
		
		
		
		Retangulo r = new Retangulo("verde", false, 3.4, 5.7);
		
		area = r.calculaArea();
		perimetro = r.calculaPerimetro();
		
		System.out.println("Area do retangulo: "+area);
		System.out.println("Perimetro do retangulo: "+perimetro);
		
		
		
		
		Quadrado q = new Quadrado("vermelho", true, 5);
		
		area = q.calculaArea();
		perimetro = q.calculaPerimetro();
		
		System.out.println("Area do quadrado: "+area);
		System.out.println("Perimetro do quadrado: "+perimetro);
		
	}
	
}
