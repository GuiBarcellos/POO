
public class PoupancaOuro extends ContaPoupanca {

	
	/**
	 * Construtor conta Poupanca Ouro.
	 * @param n - Nome titular conta.
	 * @param dia - Vencimento.
	 */
	public PoupancaOuro(String n, int dia) {
		super(n, dia);
	}

	@Override
	
	/**
	 * Atualiza saldo de acordo com a taxa passado por parametro(fator multiplicacao da taxa == 1.5).
	 */
	public void atualiza(double taxa) {
		double s = getSaldo();
		setSaldo(s * (1.0 + 1.5 * taxa));
	}
	
}
