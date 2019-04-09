
public class PoupancaSimples extends ContaPoupanca {
	
	
	/**
	 * Construtor conta Poupanca Simples.
	 * @param n - Nome titular conta.
	 * @param dia - Vencimento.
	 */
	public PoupancaSimples(String n, int dia) {
		super(n, dia);
	}

	
	@Override
	/**
	 * Atualiza saldo de acordo com a taxa passado por parametro(fator multiplicacao da taxa == 1).
	 */
	public void atualiza(double taxa){
		double s = getSaldo();
		setSaldo(s * (1.0 + taxa));
	}
	


}
