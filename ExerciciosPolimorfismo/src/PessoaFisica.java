
public class PessoaFisica extends Pessoa{

	public long cpf;
	public int dataNascimento;
	public String estadoCivil;
	//
	public PessoaFisica(String nome, String endereco, String email, long cpf, int dataNascimento, String estadoCivil){
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

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
