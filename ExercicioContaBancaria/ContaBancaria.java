/**
 * Representa uma conta bancária genérica.
 * @author delamaro
 *
 */
public abstract class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	static private int nroContas = 0;
	
	/**
	 * Construtor. Cria uma conta com saldo 0
	 * @param n Nome do titular da conta
	 * @param num Numero atribuído à conta
	 */
	public ContaBancaria(String n) {
		nomeCliente = n;
		numConta = nroContas;
		saldo = 0.0;
		nroContas++;
	}
	
	
	public int getNroContas(){
		return nroContas;
	}

	/**
	 * Obtem o nome do titular da conta.
	 * @return Nome do titular da conta.
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double s)
	{
		this.saldo = s;
	}
	
	public void saca(double qto) throws IllegalArgumentException {
		if ( saldo < qto) 
			throw new IllegalArgumentException("Saldo insuficiente para esse saque");
		saldo -= qto;
	}
	
	public void deposita(double qto) {
		saldo += qto;
	}
	
	/**
	 * Metodo abstrato, portanto subclasse precisam conter implementacao da funcao "atualiza".
	 * @param taxa
	 */
	public abstract void atualiza(double taxa);

}
