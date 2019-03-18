
public class Agenda {

	
	Pessoa[] agenda = new Pessoa[10];
	int tamanho = 0;
	
	/**
	 Funcao que verifica se a agenda esta cheia
	 */
	public boolean verificaCheia(){
		
		if(tamanho == 10)return true;
		else return false;
	}
	
	/**
	 * Funcao para adicionar uma pessoa na agenda
	 * @param nome
	 * @param idade
	 * @param altura
	 */
	public void armazenaPessoa(String nome, int idade, double altura){
		
		if(verificaCheia()){
			System.out.println("Agenda Cheia");
		}
		else{
			Pessoa aux = new Pessoa();
			aux.setNome(nome);
			aux.setIdade(idade);
			aux.setAltura(altura);
			
			agenda[tamanho] = aux;
			
			tamanho++;
		}
		
	}
	
	/**
	 * Funcao que remove uma pessoa da agenda, a partir de seu nome
	 * @param nome
	 */
	
	public void removePessoa(String nome){
		
		int posicao = 0;
		
		posicao = buscaPessoa(nome);
		
		Pessoa aux = new Pessoa();
		
		
		aux = agenda[posicao];
		
		if(posicao == tamanho){
			aux.setNome(null);
			aux.setIdade(0);
			aux.setAltura(0);
			tamanho--;
		}
		else{
			for(int i = posicao; i<tamanho; i++){
				agenda[i] = agenda[i+1];
			}
			tamanho--;
		}
	}
	
	/**
	 * Funcao busca uma pessoa na agenda e retorna sua posicao
	 * @param nome
	 * @return 20 caso a pessoa nao esteja na agenda
	 */
	public int buscaPessoa(String nome){
		
		for(int i = 0; i<tamanho; i++){
			if(nome == agenda[i].getNome()){
				return i;
			}
		}
		
		return 20;
	}
	
	/**
	 * Funcao que imprime todas as pessoas que estao na agenda
	 */
	public void imprimeAgenda(){
		
		Pessoa printando = new Pessoa();
		
		for(int i = 0; i<tamanho; i++){
			
			printando = agenda[i];
			
			System.out.println("Nome:"+printando.getNome());
			System.out.println("Idade:"+printando.getIdade());
			System.out.println("Altura:"+printando.getAltura());
			
		}
	}
	
	/**
	 * Funcao imprime uma pessoa especifica, dada sua posicao na agenda
	 * @param i
	 */
	public void imprimePessoa(int i){
		
		if(i<0 || i>10 || i > tamanho){
			System.out.println("Posicao invalida");
		}
		else{
			Pessoa printando = new Pessoa();
			printando = agenda[i];
			
			System.out.println("Nome:"+printando.getNome());
			System.out.println("Idade:"+printando.getIdade());
			System.out.println("Altura:"+printando.getAltura());
		}
	}
	
}
