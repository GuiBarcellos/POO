
public abstract class ContaPoupanca extends ContaBancaria {
private int vencimento;
	
	public ContaPoupanca(String n, int dia) {
		super(n);
		vencimento = dia;
	}

	public int getVencimento() {
		return vencimento;
	}

	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}

	/**
	 * Metodo abstrato, portanto subclasse precisam conter implementacao da funcao "atualiza".
	 * @param taxa
	 */
	public abstract void atualiza(double taxa);
	
	
}
