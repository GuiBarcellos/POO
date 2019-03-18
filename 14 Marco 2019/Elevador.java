
public class Elevador {
	
	private int andarAtual = 0;
	private int totalAndares = 0;
	private int capacidadeElevador = 0;
	private int numPessoas = 0;
	
	public Elevador(int capacidadeElevador, int totalAndares){
		this.setCapacidadeElevador(capacidadeElevador);
		this.setTotalAndares(totalAndares);
	}
	
	
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	
	
	/**
	 * Adiciona uma pessoa no elevador(caso nao esteja cheio).
	 */
	public void entraElevador(){
		
		if(this.numPessoas < this.capacidadeElevador){
			this.numPessoas++;
		}
	}
	
	/**
	 * Retira uma pessoa no elevador(ao menos uma pessoa precisa estar nele).
	 */
	public void saiElevador(){
		
		if(this.numPessoas != 0){
			this.numPessoas--;
		}
	}
	
	/**
	 * Caso nao esteja no ultimo andar, elevador sobe um andar.
	 */
	public void sobeAndar(){
		
		if(this.andarAtual < this.totalAndares){
			this.andarAtual++;
		}
		
	}
	
	/**
	 * Caso nao esteja no terreo, elevador desce um andar.
	 */
	public void desceAndar(){
		if(this.andarAtual > 0){
			this.andarAtual--;
		}
	}
}
