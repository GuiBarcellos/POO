
public class RolaDados {

	
	int numDados;
	Dado vetorDados[];
	
	/**
	 * Construtor cria e armazena varios objeto do tipo dado.
	 * @param quantidade dados.
	 */
	public RolaDados(int n) {
		this.numDados = n;
		vetorDados = new Dado[n];
		
		for(int i =0; i<n; i++) {
			vetorDados[i] = new Dado();
		}
	}
	
	
	/**
	 * Rola todos os dados.
	 * @return retorna os valores obtidos na rolagem dos dados.
	 */
	public int[] rolar() {
		
		int res[] = new int[this.numDados];
		for(int i = 0; i < this.numDados; i++) {
			res[i] = vetorDados[i].rolar();
		}
		return res;
	}
	
	/**
	 * Rola alguns dos dados.
	 * @param quais : � um array de booleanos que indica quais dados devem ser rolados. Cada posi��o representa um dos dados. Ou seja, a 
	 * posi��o 0 do array indica se o dado 1 deve ser rolado ou n�o, e assim por diante.
	 * @return Retorna o valor de cada um dos dados, inclusive os que n�o foram rolados. Nesse caso, o valor retornado � o valor anterior
	 * que ele j� possuia.
	 */
	public int[] rolar(boolean[] quais) {
		int res[] = new int[this.numDados];
		for(int i = 0; i<this.numDados; i++) {
			if(quais[i]) {
				res[i] = vetorDados[i].rolar();
			}
			else {
				res[i] = vetorDados[i].getLado();
			}
		}
		return res;
	}
	
	/**
	 * Rola alguns dos dados.
	 * @param t: � um String que possui o n�mero dos dados a serem rolados. Por exemplo "1 4 5" indica que os dados 1 4 e 5 devem ser rolados. Os 
	 * n�meros devem ser separados por espa�os. Se o valor passado no string estiver fora do intervalo v�lido, ele � ignorado.
	 * @return retorna o valor de cada um dos dados, inclusive os que n�o foram rolados. Nesse caso, o valor retornado � o valor anterior que ele j� possuia.
	 */
	public int[] rolar(java.lang.String t) {
		int res[] = new int[this.numDados];
		
		for(int i = 0; i< t.length(); i++) {
			int posicao = t.charAt(i) - '0';
			if(posicao > 0 && posicao <= this.numDados) {
				vetorDados[posicao-1].rolar();
			}
			i++;
		}
		
		
		for(int i = 0; i < this.numDados; i++) {
			res[i] = vetorDados[i].getLado();
		}
		return res;
	}
	
@Override    
	
	/**
	 * Gera e retorna uma string que contem representa��o de todos os dados do conjunto. Exibe os dados horizontalmente.
	 */
	public java.lang.String toString() {
		
		String retorno = "+-----+  ";
		for(int i = 0; i < this.numDados -1; i++){
			retorno += "+-----+  ";
		}
		
		retorno += "\n";
		
		
		for(int i = 0; i< this.numDados ; i++) {
            if (vetorDados[i].getLado() == 1) retorno +="|     |  ";
            else if (vetorDados[i].getLado() == 2 || vetorDados[i].getLado() == 3) retorno +="|*    |  ";
            else retorno +="|*   *|  ";
            if (i == this.numDados-1) retorno += "\n";
        }
		
		
		
		
		for(int i = 0; i< this.numDados; i++) {
            if (vetorDados[i].getLado() == 1 || vetorDados[i].getLado() == 3 || vetorDados[i].getLado() == 5) retorno +="|  *  |  ";
            else if (vetorDados[i].getLado() == 6) retorno +="|*   *|  ";
            else retorno +="|     |  ";
            if (i == this.numDados-1) retorno +="\n";
        }
		
		
		
		for(int i = 0; i< this.numDados; i++) {
            if (vetorDados[i].getLado() == 2 || vetorDados[i].getLado() == 3) retorno+="|    *|  ";
            else if (vetorDados[i].getLado() == 1) retorno+="|     |  ";
            else retorno+="|*   *|  ";
            if (i == this.numDados-1) retorno+="\n";
        }

        retorno+="+-----+  +-----+  +-----+  +-----+  +-----+\n";
        return retorno;
		
	}
	
}