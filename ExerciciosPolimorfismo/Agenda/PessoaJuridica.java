
public class PessoaJuridica extends Pessoa {

	public long cnpj;
	public int inscricaoEstadual;
	String razaoSocial;
	
	/**
	 * Construtor inicializa "PessoaJuridica" com caracteristicas da super classe "Pessoa" + caracteristicas PessoaJuridica.
	 * @param nome
	 * @param endereco
	 * @param email
	 * @param cnpj
	 * @param inscricaoEstadual
	 * @param razaoSocial
	 */
	public PessoaJuridica(String nome, String endereco, String email, long cnpj, int inscricaoEstadual, String razaoSocial){
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	/**
	 * Get CNPJ.
	 * @return
	 */
	public long getCnpj() {
		return cnpj;
	}
	
	/**
	 * Set CNPJ.
	 * @param cnpj
	 */
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Get Inscricao Estadual.
	 * @return
	 */
	public int getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	/**
	 * Set Inscricao Estadual.
	 * @param inscricaoEstadual
	 */
	public void setInscricaoEstadual(int inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	/**
	 * Get Razao Social.
	 * @return
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	/**
	 * Set Razao Social.
	 * @param razaoSocial
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	/**
	 * Retorna uma string com todas as informacoes da Pessoa Juridica.
	 */
	public String toString(){
		String retorno = "";
		
		retorno += "Nome Empresa: "+this.nome+"\n";
		retorno += "Endereco: "+this.endereco+"\n";
		retorno += "Email: "+this.email+"\n";
		
		retorno += "CNPJ: "+this.cnpj+"\n";
		retorno += "Inscricao Estadual: "+this.inscricaoEstadual+"\n";
		retorno += "Razao Social: "+this.razaoSocial+"\n";
		
		return retorno;
	}
	
}
