
public abstract class Funcionario {
	
	/**
	 * Caracteristicas da classe abstrata "Funcionario".
	 */
	private String nome;
	private String CPF;
	public double salario;
	
	/**
	 * Construtor da classe abstrata
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.CPF = cpf;
		this.salario = salario;
	}
	
	
	/**
	 * Get nome
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * Get CPF
	 * @return CPF
	 */
	public String getCPF() {
		return CPF;
	}


	/**
	 * Get salario.
	 * @return salario.
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * Metodo estatico para verificar se CPF válido.
	 * CPF no formato "XXXXXXXXXXX".
	 * @param cpf
	 * @return
	 */
	public static boolean verificaCPF(String cpf){
		int auxTam = cpf.length();
		
		if(auxTam < 11 || auxTam >11){
			return false;
		}
		int digitos[] = new int [11];
		for(int i = 0; i<11; i++){
			if(cpf.charAt(i) < 47 || cpf.charAt(i) > 57 ){
				return false;
			}
		}
		
		if(cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999"){
			return false;
		}
		return true;
		
		
	}
	
	/**
	 * Metodo abstrato calculaSalario. Herdeiras precisam implementar.
	 */
	public abstract double calculaSalario();
}
