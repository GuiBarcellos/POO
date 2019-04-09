
public class Produto {

	long codigoBarras;
	int qntDisponivel;
	String nome;
	
	
	/**
	 * Get Codigo de Barras.
	 * @return
	 */
	public long getCodigoBarras() {
		return codigoBarras;
	}
	
	/**
	 * Set Codigo de Barras.
	 * @param codigoBarras
	 */
	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	/**
	 * Get qntDisponivel(Estoque).
	 * @return
	 */
	public int getQntDisponivel() {
		return qntDisponivel;
	}
	
	/**
	 * Set qntDisponivel.
	 * @param qntDisponivel
	 */
	public void setQntDisponivel(int qntDisponivel) {
		this.qntDisponivel = qntDisponivel;
	}
	
	/**
	 * Get nome.
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Set nome.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Adiciona mais ao estoque de um produto.
	 * @param qntd - Quantidade a ser adicionada.
	 */
	public void addQnt(int qntd){
		this.qntDisponivel = this.qntDisponivel + qntd;
	}
	
	
}
