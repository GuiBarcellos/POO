
public class Assistente extends Funcionario {
	
	/**
	 * Contrutor da classe assistente.
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	Assistente(String nome, String cpf, double salario ){
		super(nome, cpf, salario);
	}
	
	/**
	 * Implementacao metodo calculaSalario(metodo abstrato de funcionario) para a classe Assistente.
	 */
	public double calculaSalario(){
		return this.getSalario();
	}
}
