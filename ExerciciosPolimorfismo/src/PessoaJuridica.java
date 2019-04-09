
public class PessoaJuridica extends Pessoa {

	public long cnpj;
	public int inscricaoEstadual;
	String razaoSocial;
	
	public PessoaJuridica(String nome, String endereco, String email, long cnpj, int inscricaoEstadual, String razaoSocial){
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
		
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public int getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(int inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
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
