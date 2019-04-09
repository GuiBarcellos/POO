public class Placar {

	private int[] placar;
	
	/**
	 * Construtor que inicializa vetor com 10 posicoes e seta cada uma das posicaoes com "223", uma flag
	 * para indicar que aquela posicao nao foi utilizada.
	 */
	public Placar(){
		placar = new int[10];
		for(int i = 0; i<10; i++){
			placar[i] = 223;
		}
	}
	
	/**
	 * Adiciona uma sequencia de dados em uma determinada posição do placar. Após a chamada, aquela posição torna-se ocupada e não pode ser usada uma segunda vez.
	 * @param posicao: Posicao a ser preenchida. As posições 1 a 6 correspondem às quantidas de uns até seis, ou seja, as laterais do placar.  As outas posições
	 * são: 7 - full hand; 8 - sequencia; 9 - quadra; e 10 - quina.
	 * @param dados: um array de inteiros, de tamanho 5. Cada posição corresponde a um valor de um dado. Supões-se que cada dado pode ter valor entre 1 e 6.
	 */
	public void add(int posicao, int[] dados)throws java.lang.IllegalArgumentException{
		
		if(posicao > 0 && posicao <= 10){
			switch(posicao){
			
			case 1: 
				if(this.placar[0] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 1){
							pontos++;
						}
					}
					placar[0] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 2:
				if(this.placar[1] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 2){
							pontos = pontos + 2;
						}
					}
					placar[1] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 3:
				if(this.placar[2] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 3){
							pontos = pontos + 3;
						}
					}
					placar[2] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 4:
				if(this.placar[3] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 4){
							pontos = pontos + 4;
						}
					}
					placar[3] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 5:
				if(this.placar[4] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 5){
							pontos = pontos + 5;
						}
					}
					placar[4] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
			
			case 6:
				if(this.placar[5] == 223 ){
					int pontos = 0;
					for(int i = 0; i < dados.length ; i++){
						if(dados[i] == 6){
							pontos = pontos + 6;
						}
					}
					placar[5] = pontos;
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
				
				
				
				
				
				
				
				
				
			case 7:
				if(this.placar[6] == 223){
					int [] vetAux = new int[7];
					
					for(int i = 0; i< dados.length; i++){
						int j = dados[i];
						vetAux[j]++;
					}
					
					int flagPar = 0;
					int flagTrinca = 0;
					
					for(int i = 1; i < 7; i++){
						if(vetAux[i] == 3){
							flagTrinca = 1;
						}
						else if(vetAux[i] == 2){
							flagPar = 1;
						}
					}
					
					if(flagPar == 1 && flagTrinca == 1){
						placar[6] = 15;
					}
					else{
						placar[6] = 0;
					}
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
				
				
				
			case 8:
				if(this.placar[7] == 223){
					int [] vetAux = new int[7];
					
					for(int i = 0; i< dados.length; i++){
						int j = dados[i];
						vetAux[j]++;
					}
					
					if(vetAux[1] == 1 && vetAux[2] == 1 && vetAux[3] == 1 && vetAux[4] == 1 && vetAux[5] == 1 ){
						placar[7] = 20;
					}
					else if(vetAux[2] == 1 && vetAux[3] == 1 && vetAux[4] == 1 && vetAux[5] == 1 && vetAux[6] == 1){
						placar[7] = 20;
					}
					else{
						placar[7] = 0;
					}
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 9:
				if(this.placar[8] == 223){
					int [] vetAux = new int[7];
					
					for(int i = 0; i< dados.length; i++){
						int j = dados[i];
						vetAux[j]++;
					}
					
					int flagQuadra = 0;
					
					for(int i = 1; i < 7; i++){
						if(vetAux[i] == 4){
							flagQuadra = 1;
						}
					}
					
					if(flagQuadra == 1 ){
						placar[8] = 30;
					}
					else{
						placar[8] = 0;
					}
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			case 10:
				if(this.placar[9] == 223){
					int [] vetAux = new int[7];
					
					for(int i = 0; i< dados.length; i++){
						int j = dados[i];
						vetAux[j]++;
					}
					
					int flagQuina = 0;
					
					for(int i = 1; i < 7; i++){
						if(vetAux[i] == 5){
							flagQuina = 1;
						}
					}
					
					if(flagQuina == 1 ){
						placar[9] = 40;
					}
					else{
						placar[9] = 0;
					}
				}
				else{
					throw new IllegalArgumentException("Posição já preenchida");
				}
				break;
				
			}
		}
		
	}
	
	
	/**
	 * Computa a soma dos valores obtidos, considerando apenas as posições que já estão ocupadas.
	 * @return Valor da soma.
	 */
	public int getScore(){
		int pontuacaoTotal = 0;
		for(int i = 0; i<10; i++){
			pontuacaoTotal = pontuacaoTotal + placar[i];
		}
		return pontuacaoTotal;
	}
	
	
@Override
	
	/**
	 * A representação na forma de string, mostra o placar completo, indicando quais são as posições livres 
	 * (com seus respectivos números) e o valor obtido nas posições já ocupadas.
	 */
	public java.lang.String toString(){
		String retorno = "";
		String tracejado = "-------------------------\n";
		String finaliza = "       +----------+";
		
		
		if(placar[0] == 223){
			retorno += "(1)    |";
		}
		else if(placar[0] != 223){
			retorno += placar[0]+"    |";	
		}
		if(placar[6] == 223){
			retorno += "   (7)    |";
		}
		else if(placar[6] != 223){
			retorno += "  "+placar[6]+"  |";
		}
		if(placar[3] == 223){
			retorno += "   (4) ";
		}
		else if(placar[3] != 223){
			retorno += "  "+placar[3];
		}
		
		
		retorno += "\n";
		retorno += tracejado;
		
		
		
		
		
		
		
		
		
		
		
		
		if(placar[1] == 223){
			retorno += "(2)    |";
		}
		else if(placar[1] != 223){
			retorno += placar[1]+"    |";
		}
		if(placar[7] == 223){
			retorno += "   (8)    |";
		}
		else if(placar[7] != 223){
			retorno += "  "+placar[7]+"  |";
		}
		if(placar[4] == 223){
			retorno += "   (5) ";
		}
		else if(placar[4] != 223){
			retorno += "  "+placar[4];
		}
		
		
		retorno += "\n";
		retorno += tracejado;
		
		
		
		
		
		
		
		
		
		
		if(placar[2] == 223){
			retorno += "(3)    |";
		}
		else if(placar[2] != 223){
			retorno += placar[2]+"    |";
		}
		if(placar[8] == 223){
			retorno += "   (9)    |";
		}
		else if(placar[8] != 223){
			retorno += "  "+placar[8]+"  |";
		}
		if(placar[5] == 223){
			retorno += "   (6) ";
		}
		else if(placar[5] != 223){
			retorno += "  "+placar[5];
		}
		
		
		
		retorno += "\n";
		retorno += tracejado;
		
		
		
		
		if(placar[9] == 223){
			retorno += "       |   (10)   |";
		}
		else if(placar[9] != 223){
			retorno += "        |   "+placar[9]+"   |";
		}
		
		
		retorno += "\n";
		retorno += finaliza;
		
		return retorno;
	}
	
}