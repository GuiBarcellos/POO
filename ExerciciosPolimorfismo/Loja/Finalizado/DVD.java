
public class DVD extends Produto{
	
	String diretor;
	
	/**
	 * Construtor: Cria um novo "DVD". Caracteristicas da superclasse "Produto" + caracteristica do DVD.
	 * @param codigo - Cod. Barra.
	 * @param qnt - Estoque.
	 * @param nome - Nome DVD.
	 * @param diretor 
	 */
	public DVD(long codigo, int qnt, String nome, String diretor){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.diretor = diretor;
	}
	
	/**
	 * Get Diretor.
	 * @return
	 */
	public String getDiretor() {
		return diretor;
	}
	
	/**
	 * Set diretor.
	 * @param diretor
	 */
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	
@Override
	
	/**
	 * Retorna uma string com os dados DVD.
	 */
	public String toString(){
		String retorno = "";
		retorno += "-----DVD-----\n";
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Diretor: "+this.diretor+"\n";
		retorno += "Cod Barras: "+this.codigoBarras+"\n";
		retorno += "Estoque: "+this.qntDisponivel+"\n";
		return retorno;
	}
	
}
