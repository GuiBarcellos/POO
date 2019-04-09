
public class Gerente extends Funcionario {
	
	/**
	 * Construtor da classe gerente.
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	Gerente(String nome, String cpf, double salario ){
		super(nome, cpf, salario);
	}
	
	/**
	 * Implementacao metodo calculaSalario(metodo abstrato de funcionario) para a classe Gerente.
	 */
	public double calculaSalario(){
		return 2 * this.getSalario();
	}
}
