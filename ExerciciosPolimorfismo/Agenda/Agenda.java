
public class Agenda {

	Pessoa[] agenda = new Pessoa[1000];
	private int numPessoas = 0;
	
	/**
	 * Verifica se a Agenda está lotada.
	 * @return true caso esteja lotada.
	 */
	public boolean verificaCheia(){
		
		if(numPessoas == 1000)return true;
		else return false;
	}
	
	/**
	 * Adiciona uma pessoa na agenda.
	 * @param nova
	 */
	public void adicionaAgenda(Pessoa nova){
		
		if(verificaCheia()){
			System.out.println("Agenda Cheia");
		}
		else{
			agenda[this.numPessoas] = nova;
			this.numPessoas++;
		}
	}
	
	/**
	 * Dado um nome, remove uma pessoa da agenda.
	 * @param nome - Nome da pessoa a ser removida.
	 */
	public void removeAgenda(String nome){
		
		int posicao = 0;
		
		posicao = buscaNomePosicao(nome);
		
		if(posicao >= 0 ){
			if(posicao == (this.numPessoas-1)){
				this.numPessoas--;
			}
			else{
				for(int i = posicao; i < (this.numPessoas-1); i++){
					agenda[i] = agenda[i+1];
				}
				this.numPessoas--;
			}
			
		}
		
	}
	
	/**
	 * Busca na agenda e retorna posicao.
	 * @param nome - Nome da pessoa buscada.
	 * @return Posicao da pessoa na agenda(-1 caso no ache).
	 */
	public int buscaNomePosicao(String nome){
		
		for(int i = 0; i<this.numPessoas; i++){
			if(nome.equals(agenda[i].getNome())){
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Pesquisa pelo nome e retorna Pessoa.
	 * @param nome - Nome a ser pesquisado.
	 * @return Objeto Pessoa.
	 */
	public Pessoa pesquisaNome(String nome){
		
		for(int i = 0; i<this.numPessoas; i++){
			if(nome.equals(agenda[i].getNome())){
				return agenda[i];
			}
		}
		
		return null;
	}
	
	/**
	 * Pesquisa pelo CPF e retorna Pessoa.
	 * @param CPF - CPF a ser buscado.
	 * @return Objeto Pessoa.
	 */
	public Pessoa pesquisaCpf(long CPF){
		for(int i = 0; i<this.numPessoas; i++){
			if(agenda[i] instanceof PessoaFisica){
				PessoaFisica p = (PessoaFisica)agenda[i];
				if(p.getCpf() == CPF){
					return p;
				}
			}
		}
		return null;
	}
	
	/**
	 * Pesquisa pelo CNPJ e retorna Pessoa.
	 * @param CNPJ - CNPJ a ser buscado.
	 * @return Objeto Pessoa.
	 */
	public Pessoa pesquisaCnpj(long CNPJ){
		for(int i = 0; i<this.numPessoas; i++){
			if(agenda[i] instanceof PessoaJuridica){
				PessoaJuridica p = (PessoaJuridica)agenda[i];
				if(p.getCnpj() == CNPJ){
					return p;
				}
			}
		}
		return null;
	}
	
	/**
	 * Ordena a Agenda a partir do CPF/CNPJ. Primeira parte contem as Pessoas Fisicas ordenadas pelo CPF em seguido
	 * das Pessoas Juridicas ordenadas pelo CNPJ.
	 */
	public void ordenacao(){
		
		Pessoa[] fisicos = new Pessoa[1000];
		Pessoa[] juridicos = new Pessoa[1000];
		int auxFisicos = 0;
		int auxJuridicos = 0;
		
		for(int i = 0; i < this.numPessoas; i++){
			if(agenda[i] instanceof PessoaFisica){
				fisicos[auxFisicos] = agenda[i];
				auxFisicos++;
			}
			else if(agenda[i] instanceof PessoaJuridica){
				juridicos[auxJuridicos] = agenda[i];
				auxJuridicos++;
			}
		}
		
		Pessoa aux = new Pessoa();
		
		for(int i = 0; i < auxFisicos; i++){
			for(int j = 0; j < (auxFisicos-1); j++){
				PessoaFisica p = (PessoaFisica)fisicos[j];
				PessoaFisica p1 = (PessoaFisica)fisicos[j+1];
				if(p.getCpf() > p1.getCpf()){
					aux = fisicos[j];
					fisicos[j] = fisicos[j+1];
					fisicos[j+1] = aux;
				}
			}
		}
		
		
		
		
		for(int i = 0; i < auxJuridicos; i++){
			for(int j = 0; j < (auxJuridicos-1); j++){
				PessoaJuridica p = (PessoaJuridica)juridicos[j];
				PessoaJuridica p1 = (PessoaJuridica)juridicos[j+1];
				if(p.getCnpj() > p1.getCnpj()){
					aux = juridicos[j];
					juridicos[j] = juridicos[j+1];
					juridicos[j+1] = aux;
				}
			}
		}
		
		
		
		
		
		
		
		for(int i = 0; i< auxFisicos; i++){
			agenda[i] = fisicos[i];
		}
		
		int j = 0;
		for(int i = auxFisicos; i< (auxFisicos+auxJuridicos); i++){
			agenda[i] = juridicos[j];
			j++;
		}
		
 	}
	
	
	/**
	 * Retorna string com todas as Pessoas da agenda.
	 */
	public String toString(){
		String retorno = "";
		
		for(int i = 0; i<this.numPessoas; i++){
			retorno += agenda[i].toString();
			retorno += "\n";
		}
		
		return retorno;
	}
}



