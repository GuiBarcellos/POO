
public class CD extends Produto {

	String banda;
	
	/**
	 * Construtor: Cria um novo "CD". Caracteristicas da superclasse "Produto" + caracteristica do CD.
	 * @param codigo - Cod. Barra.
	 * @param qnt - Estoque.
	 * @param nome - Nome CD.
	 * @param banda 
	 */
	public CD(long codigo, int qnt, String nome, String banda){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.banda = banda;
	}

	/**
	 * Get Banda.
	 * @return banda.
	 */
	public String getBanda() {
		return banda;
	}

	/**
	 * Set Banda.
	 * @param banda
	 */
	public void setBanda(String banda) {
		this.banda = banda;
	}

	
@Override
	
	/**
	 * Retorna uma string com os dados do CD.
	 */
	public String toString(){
		String retorno = "";
		retorno += "-----CD-----\n";
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Banda: "+this.banda+"\n";
		retorno += "Cod Barras: "+this.codigoBarras+"\n";
		retorno += "Estoque: "+this.qntDisponivel+"\n";
		return retorno;
	}
	
}
