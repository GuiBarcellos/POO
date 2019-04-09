
public class Livro extends Produto {

	String autor;
	/**
	 * Construtor: Cria um novo "Livro". Caracteristicas da superclasse "Produto" + caracteristica do Livro.
	 * @param codigo - Cod. Barra.
	 * @param qnt - Estoque.
	 * @param nome - Nome Livro.
	 * @param autor
	 */
	public Livro(long codigo, int qnt, String nome, String autor){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.autor = autor;
	}

	/**
	 * Get autor.
	 * @return
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * Set autor.
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	
	/**
	 * Retorna uma string com os dados do Livro.
	 */
	public String toString(){
		String retorno = "";
		retorno += "-----LIVRO-----\n";
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Autor: "+this.autor+"\n";
		retorno += "Cod Barras: "+this.codigoBarras+"\n";
		retorno += "Estoque: "+this.qntDisponivel+"\n";
		return retorno;
	}
	
	
}
