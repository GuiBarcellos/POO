
public class Livro extends Produto {

	String autor;
	
	public Livro(long codigo, int qnt, String nome, String autor){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	@Override
	
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
