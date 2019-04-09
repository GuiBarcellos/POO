
public class Dado {

	private int lados;
	private int ultimaFace;
	Random x = new Random();
	
	
	/**
	 * Construtor que seta numero de lados = 6(Dado padrao), caso numero lados
	 * nao seja passado como parametro.
	 */
	
	public Dado(){
		this.lados = 6;
	}
	
	
	/**
	 * Contrutor seta numero de lados recebido como parametro.
	 * @param n = numero de lados.
	 */
	public Dado(int n){
		this.lados = n;
	}
	
	/**
	 * Recupera ultimo numero selecionado.
	 * @return ultimo valor da face.
	 */
	public int getLado(){
		return this.ultimaFace;
	}
	
	
	/**
	 * Simula rolagem dado por meio gerador aleatorio.
	 * @return numero sorteado.
	 */
	public int rolar(){
		this.ultimaFace = (x.getIntRand(this.lados) + 1);
		return this.ultimaFace;
	}
	
	
	@Override
	
	/**
	 * Transforma representação do dado em string.
	 */
	public java.lang.String toString(){
		
		if(this.ultimaFace == 1){
			return "+-----+\n|     |\n|  *  |\n|     |\n+-----+\n";
		}
		else if(this.ultimaFace == 2){
			return "+-----+\n|*    |\n|     |\n|    *|\n+-----+\n";           	
		}
		else if(this.ultimaFace == 3){
			return "+-----+\n|*    |\n|  *  |\n|    *|\n+-----+\n";
		}
		else if(this.ultimaFace == 4){
			return "+-----+\n|*   *|\n|     |\n|*   *|\n+-----+\n";      
		}
		else if(this.ultimaFace == 5){
			return "+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+\n";
		}
		else if(this.ultimaFace == 6){
			return "+-----+\n|*   *|\n|*   *|\n|*   *|\n+-----+\n";
		}
		else{
			String erro = "Valor obtido:" + this.ultimaFace + "\n";
			return erro;
		}
	}

}
