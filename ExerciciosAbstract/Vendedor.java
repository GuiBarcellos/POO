
public class Vendedor extends Funcionario {
	
	private double comissao;
	
	/**
	 * Construtor da classe vendedor.
	 * @param nome
	 * @param cpf
	 * @param salario
	 * @param comissao
	 */
	Vendedor(String nome, String cpf, double salario, double comissao ){
		super(nome, cpf, salario);
		this.comissao = comissao;
	}
	
	/**
	 * Implementacao metodo calculaSalario(metodo abstrato de funcionario) para a classe Vendedor.
	 */
	public double calculaSalario(){
		return (1 + comissao) * this.getSalario();
	}

}
