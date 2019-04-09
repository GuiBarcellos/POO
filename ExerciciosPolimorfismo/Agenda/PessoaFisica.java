
public class PessoaFisica extends Pessoa{

	public long cpf;
	public String dataNascimento;
	public String estadoCivil;
	
	/**
	 * Construtor inicializa "PessoFisica" com caracteristicas da super classe "Pessoa" + caracteristicas PessoaFisica.
	 * @param nome
	 * @param endereco
	 * @param email
	 * @param cpf
	 * @param dataNascimento
	 * @param estadoCivil
	 */
	public PessoaFisica(String nome, String endereco, String email, long cpf, String dataNascimento, String estadoCivil){
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	/**
	 * Get CPF.
	 * @return
	 */
	public long getCpf() {
		return cpf;
	}
	
	/**
	 * Set CPF.
	 * @param cpf
	 */
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Get Data de Nascimento.
	 * @return
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	/**
	 * Set Data Nascimento.
	 * @param dataNascimento
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	/**
	 * Get Estado Civil.
	 * @return
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	/**
	 * Set Estado Civil.
	 * @param estadoCivil
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

	/**
	 * Retorna uma string com todas informacoes da Pessoa Fisica.
	 */
	public String toString(){
		String retorno = "";
		
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Endereco: "+this.endereco+"\n";
		retorno += "Email: "+this.email+"\n";
		
		retorno += "CPF: "+this.cpf+"\n";
		retorno += "Data Nascimento: "+this.dataNascimento+"\n";
		retorno += "Estado Civil: "+this.estadoCivil+"\n";
		
		return retorno;
	}
	
	
}
