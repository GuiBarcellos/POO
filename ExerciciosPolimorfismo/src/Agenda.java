public class Agenda {

	Pessoa[] agenda = new Pessoa[1000];
	private int numPessoas = 0;
	
	public boolean verificaCheia(){
		
		if(numPessoas == 1000)return true;
		else return false;
	}
	
	public void adicionaAgenda(Pessoa nova){
		
		if(verificaCheia()){
			System.out.println("Agenda Cheia");
		}
		else{
			agenda[numPessoas] = nova;
			numPessoas++;
		}
	}
	
	public void removeAgenda(){
		
	}
	
	
	public void pesquisaNome(){
		
	}
	
	
	public void pesquisaCpf(){
		
	}
	
	public void pesquisaCnpj(){
		
	}
	
	public void ordenacao(){
		
	}
	
	public String toString(){
		String retorno = "";
		
		return retorno;
	}
}









/**
 * 
 * 	String nome = "Guilherme";
		String endereco = "Jacinto Favoreto";
		String email = "guitargon@usp.br";
		
		long cpf = 49700539873L;
		int dataNascimento = 9101998;
		String estadoCivil = "solteiro";
		
		PessoaFisica pf = new PessoaFisica(nome, endereco, email, cpf, dataNascimento, estadoCivil);
		
		String printa = pf.toString();
		
		System.out.println(printa);
 */